class Solution 
{
    class pair
    {
        String word;
        int freq;
        pair(String w, int f)
        {
            word = w;
            freq = f;
        }
    }
    public List<String> topKFrequent(String[] words, int k) 
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int max = 0;
        for(String word:words)
        {
            if(!map.containsKey(word)) map.put(word, 1);
            else map.put(word, map.get(word)+1);
            max = Math.max(max, map.get(word));
        }
        List<pair> list = new ArrayList<pair>();
        for(String s: map.keySet())
        {
            pair p = new pair(s, map.get(s));
            list.add(p);
        }
        
        Collections.sort(list, new Comparator<pair>(){
            public int compare(pair p1, pair p2)
            {
                if(p2.freq != p1.freq) return p2.freq - p1.freq;
                String s1 = p1.word;
                String s2 = p2.word;
                return s1.compareTo(s2);
                
            }
        });  
        List<String> res = new ArrayList<String>(); 
        for(int i = 0; i < k; i++)
        {
            res.add(list.get(i).word);
        }
        return res;
    }
}