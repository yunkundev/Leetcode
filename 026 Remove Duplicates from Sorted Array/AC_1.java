public class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int last = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i > 0 && last == nums[i])
            {
                continue;
            }
            else
            {
                last = nums[i];
                nums[count++] = last;
            }
        }
        return count;
    }
}
