class Solution 
{
    public String alienOrder(String[] words) 
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        List<char[]> list = new ArrayList<char[]>();
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words[i].length(); j++)
            {
                char c= words[i].charAt(j);
                if(!map.containsKey(c)) map.put(c, 0);
            }
        }
        
        for(int i = 0; i < words.length-1; i++)
        {
            String word1 = words[i];
            String word2 = words[i+1];
            for(int j = 0; j < word1.length() && j < word2.length(); j++)
            {
                if(word1.charAt(j) == word2.charAt(j)) continue;        
                else
                {
                    char c1 = word1.charAt(j);
                    char c2 = word2.charAt(j);
                    list.add(new char[]{c1, c2});
                    map.put(c2, map.get(c2) + 1);
                    break;
                }
            }
        }
        
        // for(char[] ca :list)
        // {
        //     System.out.println(ca[0] + " "+ ca[1]);
        // }
        
        StringBuffer res = new StringBuffer();
        while(map.size()>0)
        {
            int count = 0;
            char pre = 'a';
            for(char c: map.keySet())
            {
                //System.out.println(c + " "+ map.get(c));
                if(map.get(c) == 0)
                {
                    pre = c;
                    count++;
                }
            }
            //System.out.println(pre + "  "+count);
            
            if(count == 0) return "";
            
            int i = 0;
            while(i < list.size())
            {
                if(list.get(i)[0] == pre) 
                {
                    map.put(list.get(i)[1], map.get(list.get(i)[1])-1);
                    list.remove(list.get(i));
                }
                else i++;
            }
            map.remove(pre);
            res.append(pre);
        }
        return res.toString();
    }
}