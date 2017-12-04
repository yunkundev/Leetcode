class Solution 
{
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> res = new ArrayList<Integer>();
        if(s.length() < p.length()) return res;
        char[] modle = new char[26];
        for(int i = 0; i < p.length(); i++)
        {
            modle[p.charAt(i)-'a']++;
        }
        
        int start = 0;
        int end = 0;
        char[] cmp = new char[26];
        while(end < p.length()-1)
        {
            cmp[s.charAt(end) - 'a']++;
            end++;
        }
        while(end < s.length())
        {
            cmp[s.charAt(end) - 'a']++;
            end++;
            int e = 0;
            for(int i = 0;i < 26; i++)
            {
                if(cmp[i] == modle[i]) e++;
            }
            if(e == 26) res.add(start);
            cmp[s.charAt(start) - 'a']--;
            start++;
        }
        return res;
    }
}