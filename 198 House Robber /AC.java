class Solution 
{
    public int rob(int[] nums) 
    {
        int n = nums.length;
        if(n == 0)return 0;
        if(n == 1)return nums[0];
        int[] dp = new int[n+2];
        dp[n] = 0;
        dp[n+1] = 0;
        for(int i = n -1;i >= 0; i--)
        {
            dp[i] = Math.max(dp[i+1], nums[i]+dp[i+2]);
        }
        return dp[0];   
    }
}