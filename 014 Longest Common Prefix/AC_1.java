public class Solution
{

    public String longestCommonPrefix(String[] strs)
    {
        String ans = "";
        if(strs.length == 0 )
        {
            return ans;
        }
        else if(strs.length == 1)
        {
            return strs[0];
        }
        else
        {
            for(int j = 0; ; j++)
            {
                if(strs[0]=="") return ans;
                if( j >= strs[0].length() )
                {
                    return strs[0];
                }
                char a = strs[0].charAt(j);

                for(int i = 1; i < strs.length;i++)
                {
                    if( j >= strs[i].length() )
                    {
                        return strs[i];
                    }
                    if(strs[i].charAt(j) != a)
                    {
                        return strs[i].substring(0,j);
                    }

                }
            }
        }


    }
}
