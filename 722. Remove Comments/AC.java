class Solution
{
    public List<String> removeComments(String[] source)
    {
        int cdt = 0;
        List<String> res = new ArrayList<String>();
        StringBuffer tmp = new StringBuffer();
        for(String s:source)
        {
            
            for(int i = 0; i < s.length(); i++)
            {
                
                if(i < s.length() - 1 && s.charAt(i) == '/' && s.charAt(i+1) == '*' && cdt == 0 )
                {
                    i++;
                    cdt = 1;
                }
                
                else if(i < s.length() - 1 && s.charAt(i) == '*' && s.charAt(i+1) == '/' && cdt == 1)
                {
                    i++;
                    cdt = 0;
                }
                
                else if(i < s.length() - 1 && s.charAt(i) == '/' && s.charAt(i+1) =='/' && cdt == 0)
                {
                    i++;
                    cdt = 3;
                }
                
                else if(cdt == 1)
                {
                    continue;
                }
                
                else if(cdt == 3)
                {
                    continue;
                }
                
                else if(cdt == 0)
                {
                    tmp.append(s.charAt(i));
                }
            }
            
            if(cdt == 3)
            {
                cdt = 0;
                if(tmp.toString().length() != 0)
                {
                    res.add(tmp.toString());
                    tmp = new StringBuffer();
                }
                
            }
            
            if(cdt == 0)
            {
                if(tmp.toString().length() != 0)
                {
                    res.add(tmp.toString());
                    tmp = new StringBuffer();
                }
                
            }
            
            
        }
        return res;
    }
}
