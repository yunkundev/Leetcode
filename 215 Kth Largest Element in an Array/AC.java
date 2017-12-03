class Solution 
{
    public void swap(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public int partition(int[] nums, int k, int start, int end, int num)
    {
        int i = start+1; 
        int j = end;
        int tmp = start;
        while(i <= j)
        {
            while(i <= j )
            {
                if(nums[j] <= num)
                {
                    swap(nums, tmp, j);
                    tmp = j;
                    break;
                }
                j--;
            }
            
            while(i <= j)
            {
                if(nums[i] > num)
                {
                    swap(nums, tmp, i);
                    tmp = i;
                    break;
                }
                i++;
            }
            
        }
        return tmp;
    }
    
    public int findKthSmallest(int[] nums, int k, int start, int end)
    {
        //System.out.println(start + " " + end +" "+k);
        int p = partition(nums, k, start, end, nums[start]);
        //System.out.println(range[0] + " "+ range[1]);
        if( k == (p-start+1) ) return nums[p];
        else if( k < (p - start + 1)) return findKthSmallest(nums, k, start, p-1);
        else return findKthSmallest(nums, k - (p-start+1), p+1, end);
        
    }
    
    public int findKthLargest(int[] nums, int k) 
    {
        return findKthSmallest(nums, nums.length+1-k, 0, nums.length-1);
    }
}