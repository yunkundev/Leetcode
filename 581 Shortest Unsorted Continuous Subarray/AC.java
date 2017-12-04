class Solution 
{
    public int findUnsortedSubarray(int[] nums) 
    {
        int[] copy = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(copy[i] == nums[i])
                count++;
            else
                break;
        }
        if(count == nums.length) return 0;
        for(int i = nums.length -1; i >= 0; i--)
        {
            if(copy[i] == nums[i])
                count++;
            else 
                break;
        }
        return nums.length - count;
    }
}