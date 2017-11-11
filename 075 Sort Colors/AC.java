class Solution 
{
    public void exchange(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void sortColors(int[] nums) 
    {
        int white = 0;
        int red = 0;
        int blue = nums.length - 1;
        while(white <= blue)
        {
            if(nums[white] == 1)
            {
                white++;
            }
            else if(nums[white] == 2)
            {
                exchange(nums, white, blue);
                blue --;
            }
            else
            {
                exchange(nums, white, red);
                red++;
                white++;
            }
        }
    }
}