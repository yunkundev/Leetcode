class Solution
{
    public int helper(int[] nums, int d)
    {
        int start = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            while(start < i && nums[i] - nums[start] > d)
            {
                start ++;
            }
            count += i - start;
        }
        return count;
    }
    
    public int smallestDistancePair(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int left = 0;
        int right = 10000000;
        while(left < right)
        {
            //System.out.println(left +" "+right);
            int mid = (left + right)/2;
            int count = helper(nums, mid);
            //System.out.println(mid + " "+count);
            if(count >= k) right = mid; 
            else left = mid + 1;
        }
        return left;
    }
}