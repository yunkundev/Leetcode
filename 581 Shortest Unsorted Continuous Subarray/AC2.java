class Solution 
{
    public int findUnsortedSubarray(int[] nums) 
    {
        int n = nums.length;
        int max = nums[0];
        int end = -1;
        for(int i = 0; i < n; i++)
        {
            max = Math.max(nums[i], max);
            if(nums[i] < max) end = i;
        }
        int min = nums[n-1];
        int start = 0;
        for(int i = n-1; i >= 0; i--)
        {
            min = Math.min(nums[i], min);
            if(nums[i] > min) start = i;
        }
        return end - start + 1;
    }
}