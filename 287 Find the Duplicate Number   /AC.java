class Solution 
{
    public void exchange(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public int findDuplicate(int[] nums) 
    {

        while(true)
        {
            int tmp = nums[0];
            if(nums[tmp] == tmp) return tmp;
            exchange(nums, 0, tmp);
        }
    }
}