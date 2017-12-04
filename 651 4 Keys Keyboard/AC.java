class Solution 
{
    public int maxA(int N) 
    {
        int[] dp = new int[N+1];
        for(int i = 1; i <= N; i++)
        {
            dp[i] = i;
            // j the step you go before
            for(int j = 2; j < i; j++)
            {
                dp[i] = Math.max(dp[i], dp[j] * (i-j-1));
            }
        }
        //for(int i = 1; i <= N; i++) System.out.print(dp[i]+" ");
        return dp[N];
    }
}