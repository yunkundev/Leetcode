public class Solution
{
    public boolean isMatch(String s, String p)
    {
        int n1 = s.length();
        int n2 = p.length();
        boolean[][] dp = new boolean[n1+1][n2+1];

        dp[0][0] = true;
        for(int i = 1; i <= n1; i++ )
        {
            dp[i][0] = false;
        }
        for(int j = 1; j <= n2; j++ )
        {
            dp[0][j] = false;
        }

        for(int i = 0; i <= n1; i++)
        {
            for(int j = 1; j <= n2; j++)
            {
                if(p.charAt(j-1) == '*' )
                {
                    if(dp[i][j-2] || dp[i][j-1] )
                    {
                        dp[i][j] = true;
                    }
                    else if( i> 0 &&dp[i-1][j] && (p.charAt(j-2) == s.charAt(i-1)||p.charAt(j-2) == '.' ))
                    {
                        dp[i][j] = true;
                    }
                }
                else if(p.charAt(j-1) == '.')
                {
                    if(i>0 && dp[i-1][j-1])
                    {
                        dp[i][j] = true;
                    }
                }
                else if(i>0 && p.charAt(j-1) == s.charAt(i-1) )
                {
                    if(dp[i-1][j-1])
                    {
                        dp[i][j] = true;
                    }
                }
                else
                {
                    dp[i][j] = false;
                }
            }
        }

        // for(int i = 0; i<= n1; i++)
        // {
        //     for(int j = 0; j<= n2; j++)
        //     {
        //         System.out.print( dp[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }


        return dp[n1][n2];

    }
}
