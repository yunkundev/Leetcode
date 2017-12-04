class Solution 
{
    public int strangePrinter(String s) 
    {
        int n = s.length();
        if(n == 0) return 0;
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            dp[i][i] = 1;
        }
        for(int k = 1; k < n; k++)
        {
            for(int i = 0; i +k < n; i++)
            {
                int j = i + k;
                int min = Integer.MAX_VALUE;
                for(int f = i; f < j; f++)
                {
                    int tmp = dp[i][f] + dp[f+1][j];
                    if(s.charAt(i) == s.charAt(f+1)) tmp--;
                    min = Math.min(min, tmp);
                }
                dp[i][j] = min;
            }
        }
        return dp[0][n-1];
    }
}