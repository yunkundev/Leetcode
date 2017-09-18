class Solution 
{
    public int[] searchRange(int[] nums, int target)
    {
        
        // lower bound
        
        
        int first = 0, last = nums.length - 1;
        
        
        
        int middle = 0;
        int[] ans = {-1,-1};
        int[] ans_no = {-1,-1};
        
        if(nums.length == 0 || target < nums[0] || target > nums[last]) return ans;
        
        
        while(first <= last)
        {
            middle = first + (last - first )/2;
            if(nums[middle] >= target)  last = middle - 1 ;
            else first = middle + 1;
            if(nums[middle] == target) ans[0] =middle;
        }
        if(nums[first] != target) return ans_no;

        
        first =0;
        last = nums.length -1;
        while(first <= last)
        {
            middle = first + (last -first)/2 ;
            
            if(nums[middle] > target)   last = middle - 1;  
            else first = middle + 1; 
            if(nums[middle] == target) ans[1] = middle;
        }  

        return ans;
        
        
        
    }
}