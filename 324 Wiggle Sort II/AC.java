class Solution 
{
    public void exchange(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    public void wiggleSort(int[] nums) 
    {
        if(nums.length ==0  || nums.length == 1) return;
        Arrays.sort(nums);
        int i1 = 0; 
        int i2 = (nums.length+1)/2;
        int mid = nums[i2];
        while(i2 < nums.length && nums[i2] == mid) i2++;
        int[] new_nums = new int[nums.length];
        for(int i= 0; i < new_nums.length; i++)
        {
            new_nums[i] = mid;
        }
        int end = nums.length-1;
        if(end%2 == 1) end--;
        for(; nums[i1] < mid; i1++)
        {
            new_nums[end] = nums[i1];
            end -= 2;
        }
        
        
        int start = 1;
        for(int i = nums.length-1; nums[i]>mid; i--)
        {
            new_nums[start] = nums[i];
            start += 2;
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = new_nums[i];
        }
    }
}