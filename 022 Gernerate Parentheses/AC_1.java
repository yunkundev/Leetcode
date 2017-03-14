public class Solution
{
    public List<String> generateParenthesis(int n)
    {
        List<String> res = new ArrayList<String>();
        res.add("");
        for(int lcount = 1; lcount <= n; lcount++)
        {
            List<String> list1 = new ArrayList<String>();
            for(String s:res)
            {
                list1.add(s.concat("("));

            }
            String tmp = "";
            List<String> list2 = new ArrayList<String>();
            for(int rcount = 0; rcount <= lcount; rcount++)
            {
                //System.out.println(lcount+"  "+rcount);

                for(String s:list1)
                {
                    if(s.concat(tmp).length() > 2*lcount )
                    {
                        continue;
                    }
                    list2.add(s.concat(tmp));

                }
                tmp = tmp.concat(")");
            }
            res = list2;
        }
        List<String> res2 = new ArrayList<String>();
        for(String s :res)
        {
            if(s.length() == 2*n)
            {
                res2.add(s);
            }
        }
        return res2;

    }
}
