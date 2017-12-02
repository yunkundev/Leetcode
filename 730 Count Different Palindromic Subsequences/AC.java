class Solution 
{
    HashMap<Integer, Long> map;
    public long count(String s, int start, int end)
    {
    
        if(start > end) return 1;
        if(start == end) return 2;
        if(map.containsKey(start*s.length()+end)) return map.get(start*s.length()+end);
        char[] alp = {'a','b','c','d'};
        long count = 1;
        boolean[] ap = new boolean[4];
        for(int i = start; i <= end; i++)
        {
            if(!ap[s.charAt(i)-'a'])
            {
                count++;
                ap[s.charAt(i)-'a'] = true;
            }
        }
        for(int k = 0; k < 4; k++)
        {
            int is = -1;
            int ie = -1;
            for(int i = start; i <= end; i++)
            {
                if(s.charAt(i) == alp[k])
                {
                    is = i;
                    break;
                }
            }
            for(int i = end; i >= start; i--)
            {
                if(s.charAt(i) == alp[k])
                {
                    ie = i;
                    break;
                }
            }
            if(is == -1 || ie == -1 )
            {
                continue;
            }
            
            else if(ie > is)
            {
                count += count(s, is+1, ie-1);
            }
            
        }
        if(count > 1000000007) count = count% 1000000007;
        map.put(start*s.length()+end, count);
        
        return count;
            
        
        
    }
    
    public int countPalindromicSubsequences(String S) 
    {
        map = new HashMap<Integer, Long>();
        long len = count(S, 0, S.length()-1);
        len = len%1000000007;
        return (int)(len-1);
    }
}