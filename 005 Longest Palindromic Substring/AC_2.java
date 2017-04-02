public class Solution
{
    public String longestPalindrome(String s)
    {
        int n = s.length();
        //dp[i][j]: Si,j is a palindrome or not
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i ++)
        {
            dp[i][i] = true;
        }
        int max = 0, maxi =0, maxj = 0;
        for(int k = 1; k < n; k++)
        {
            for(int i = 0; i < n-k; i++)
            {
                int j = i+k;
                if(s.charAt(i) == s.charAt(j) )
                {
                    if(j == i + 1)
                    {
                        dp[i][j] = true;
                        if( j-i+1 > max)
                        {
                            max = j - i +1;
                            maxi = i;
                            maxj = j;
                        }
                    }
                    else if(dp[i+1][j-1] == true)
                    {
                        dp[i][j] = true;
                        if( j-i+1 > max)
                        {
                            max = j-i+1;
                            maxi = i;
                            maxj = j;
                        }
                    }
                    else
                    {
                        dp[i][j] = false;
                    }
                }
                else
                {
                    dp[i][j] = false;
                }
            }
        }
        return s.substring(maxi,maxj+1);
    }
}
