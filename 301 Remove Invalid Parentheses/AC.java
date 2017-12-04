class Solution 
{
    public boolean isValid(String s)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
            }
            if(s.charAt(i) == ')')
            {
                count--;
                if(count < 0) return false;
            }
        }
        if(count != 0) return false;
        return true;
        
    }
    
    public List<String> removeInvalidParentheses(String s) 
    {
        
        List<String> list = new ArrayList<String>();
        list.add(s);
        if(isValid(s)) return list;
        HashSet<String> set = new HashSet<String>();
        List<String> res = new ArrayList<String>();
        while(list.size() > 0)
        {
            HashSet<String> set_next = new HashSet<String>();
            for(String str:list)
            {
                for(int i = 0; i < str.length(); i++)
                {
                    String next = str.substring(0, i) + str.substring(i+1);
                    if(isValid(next))  set.add(next);
                    set_next.add(next);
                }
            }
            if(set.size() > 0) 
            {
                for(String st:set)
                {
                    res.add(st);
                }
                return res;
            }
            list = new ArrayList<String>();
            for(String st:set_next)
            {
                list.add(st);
            }
        }
        return res;
            
    }
}