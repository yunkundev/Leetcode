class Solution 
{
    public int root(int index, int[] parents)
    {
        while(parents[index] != index) 
            index = parents[index];
            //parents[index] = parents[parents[index]];
        return index;
    }
    
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) 
    {
        if(words1.length != words2.length) return false;
        int index = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String[] pair:pairs)
        {
            for(String str:pair)
            {
                if(!map.containsKey(str)) map.put(str, index++);
            }
        }
        
        int[] parents = new int[index];
        for(int i = 0; i < index; i++)
        {
            parents[i] = i;
        }
        for(String[] pair:pairs)
        {
            int index1 = map.get(pair[0]);
            int index2 = map.get(pair[1]);
            // Union
            parents[root(index1, parents)] = root(index2, parents);
        }
        
        for(int i = 0; i < words1.length; i++)
        {
            if(words1[i].equals(words2[i])) continue;
            if(!map.containsKey(words1[i])) return false;
            if(!map.containsKey(words2[i])) return false;
            int index1 = map.get(words1[i]);
            int index2 = map.get(words2[i]);
            if(root(index1, parents) != root(index2, parents)) return false;
        }
        return true;
    }
}