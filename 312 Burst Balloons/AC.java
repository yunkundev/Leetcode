class Solution 
{
    public int maxCoins(int[] nums) 
    {
        int n = nums.length;
        int[] tmp = new int[n+2];
        for(int i = 0; i < n; i++)  tmp[i+1] = nums[i];
        tmp[0] = 1;
        tmp[n+1] = 1;
        nums = tmp;
        // for(int i:nums) System.out.print(i+" ");
        int[][] dp = new int[n+2][n+2];       
        for(int i = 1; i <= n; i++)
        {
            dp[i][i] = nums[i-1]*nums[i]*nums[i+1];
        }
        for(int len = 1; len < n; len++)
        {
            for(int left = 1; left + len <= n; left ++)
            {
                int right = left + len;
                for(int i = left; i <= right; i++)
                {
                    int p = nums[left-1]*nums[i]*nums[right+1];
                    dp[left][right] = Math.max(dp[left][right], p+dp[left][i-1]+dp[i+1][right]);
                }
            }
        }
        
        return dp[1][n];
    }
}