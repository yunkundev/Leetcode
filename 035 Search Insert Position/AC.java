class Solution 
{
    
    
    public int searchInsert(int[] nums, int target) 
    {
        int n = nums.length-1;
        int l = 0;
        
        while(l<=n)
        {
            
            int mid = (n+l)/2;
            if (nums[mid] ==  target) return mid;
            else if(nums[mid] > target) n = mid-1;
            else l = mid +1;
        }
        return l;
    }
}