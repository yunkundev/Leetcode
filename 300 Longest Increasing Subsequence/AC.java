class Solution 
{
    public int lengthOfLIS(int[] nums) 
    {
        int n = nums.length;
        if(n == 0 || n == 1)return n;
        int[] dp = new int[n];
        dp[n-1] = 1;
        int max = 0;
        for(int i = n-2; i >= 0; i--)
        {
            dp[i] = 1;
            for(int j = i+1; j < n; j++ )
            {
                if(nums[i] < nums[j])
                {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}