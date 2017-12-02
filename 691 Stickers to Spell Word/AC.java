class Solution 
{
    public String alpToStr(int[] alp)
    {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 26; i++)
        {
            for(int j = 0; j < alp[i]; j++)
            {
                sb.append((char)('a'+i));
            }
        }
        return sb.toString();
    }
    
    public int[] strToAlp(String s)
    {
        int[] alp = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            alp[s.charAt(i) - 'a']++;
        }
        return alp;
    }
    
    HashMap<String, Integer> map = new HashMap<>();
    public int min(String[] stickers, String target)
    {
        boolean possible = false;
        if(map.containsKey(target)) return map.get(target);
        int[] ta = strToAlp(target);
        int sum = 0;
        for(int i = 0; i < 26; i++)
        {
            sum += ta[i];
        }
        if(sum == 0) return 0;
        int res = Integer.MAX_VALUE;
        for(String s:stickers)
        {
            ta = strToAlp(target);
            int[] sa = strToAlp(s);
            boolean change = false;
            for(int i =0; i < 26; i++)
            {
                if(sa[i] > 0 && ta[i] > 0)
                {
                    
                    change = true;
                    ta[i] = Math.max(0, ta[i] - sa[i]);
                }
            }
            if(change) 
            {
                String nt = alpToStr(ta);
                int next = min(stickers, nt);
                if(next != -1)
                {
                    possible = true;
                    res = Math.min(next+1, res);
                }
            }
            
        }
        if(!possible) res = -1;
        map.put(target, res);
        return res;
    }
    
    
    public int minStickers(String[] stickers, String target) 
    {
        int[] alp = strToAlp(target);
        String s = alpToStr(alp);
        return min(stickers, s);
        
    }
}