class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int numsn = -1;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            while( i != nums[i] )
            {
                if(nums[i] == n) 
                {
                    numsn = nums[i];
                    nums[i] = -1;
                    break;
                }
                else
                {
                    int tmp = nums[i];
                    if(tmp == -1) break;
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
            }
        }
        if(numsn != n && numsn >= 0) 
        {
            int tmp = numsn;
            numsn = nums[tmp];
            nums[tmp] = tmp;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != i) return i;
        }
        return n;
    }
}