class Solution 
{
    public boolean find132pattern(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        int tmp = Integer.MIN_VALUE;
        for(int i = nums.length-1; i >= 0; i--)
        {
            //System.out.println(i);
            if(!stack.empty() && nums[i] < stack.peek()) return true;
            if( nums[i] > max )
            {
                //System.out.println(max);
                stack.push(max);
                max = nums[i];
                tmp = Integer.MIN_VALUE;
            }
            else if(nums[i] > tmp && tmp != Integer.MIN_VALUE)
            {
                //System.out.println(tmp);
                stack.push(tmp);
            }
            else if(nums[i] < max && nums[i] > stack.peek())
            {
                tmp = Math.max(tmp, nums[i]);
            }
            
        }
        return false;
    }
}