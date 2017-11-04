class Solution
{
    public int findNumberOfLIS(int[] nums)
    {
        int n = nums.length;
        if(n == 0) return 0;
        int[] dp = new int[n];
        int[] maxnum = new int[n];
        dp[n-1] = 1;
        maxnum[n-1] = 1;
        int max = 1;
        
        for(int i = n-2; i >= 0; i--)
        {
            int localmax = 1;
            int localnum = 1;
            for(int j = i+1; j < n; j ++ )
            {
                if(nums[j] > nums[i])
                {
                    if(dp[j] + 1 > localmax)
                    {
                        localmax = dp[j] + 1;
                        localnum = maxnum[j];
                    }
                    else if(dp[j] + 1 == localmax)
                    {
                        localnum += maxnum[j];
                    }
                }
                
            }
            dp[i] = localmax;
            maxnum[i] = localnum;
            max = Math.max(localmax, max);
            //System.out.println(dp[i] + " " +maxnum[i]);
            
        }
        int res = 0;
        for(int i = 0; i < n; i++ )
        {
            if(dp[i] == max)
                res += maxnum[i];
        }
        return res;
    }
}
