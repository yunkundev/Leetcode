class Solution 
{
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        int index = 1;
        for(int i = 0; i < pairs.length; i++)
        {
            if(!map.containsKey(pairs[i][0]) && !map.containsKey(pairs[i][1])) 
            {
                map.put(pairs[i][0], index);
                map.put(pairs[i][1], index);
                index ++;
            }
            else if(map.containsKey(pairs[i][0]) && map.containsKey(pairs[i][1]) ) 
            {
                if(map.get(pairs[i][0]) == map.get(pairs[i][1])) continue;
                int p = map.get(pairs[i][1]);
                for(String key:map.keySet())
                {
                    if(map.get(key) == p)
                    {
                        map.put(key, map.get(pairs[i][0]));
                    }
                }
            }
            else if(map.containsKey(pairs[i][0]) && !map.containsKey(pairs[i][1])  )
            {
                map.put(pairs[i][1], map.get(pairs[i][0]));
            }
            else if(map.containsKey(pairs[i][1]) && !map.containsKey(pairs[i][0])  )
            {
                map.put(pairs[i][0], map.get(pairs[i][1]));
            }
            
        }

        
        // for(String key:map.keySet())
        // {
        //     System.out.println(key + "  " + map.get(key));
        // }
        
        if(words1.length != words2.length)
        {
            return false;
        }
        for(int i = 0; i < words1.length; i++)
        {
            if(map.get(words1[i]) != map.get(words2[i])) return false;
        }
        return true;
        
    }
}