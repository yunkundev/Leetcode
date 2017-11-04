class Solution
{
    public int findLengthOfLCIS(int[] nums)
    {
        if(nums.length == 0) return 0;
        int len = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > nums[i-1])
            {
                len ++;
                max = Math.max(len, max);
            }
            else
            {
                len = 1;
            }
        }
        return max;
    }
}
