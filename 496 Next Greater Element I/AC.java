class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = nums2.length-1; i >= 0; i--)
        {
            int num = nums2[i];
            while(true)
            {
                if(stack.empty()||stack.peek()>num)
                {
                    if(stack.empty()) map.put(num, -1);
                    else map.put(num, stack.peek());
                    stack.push(num);
                    break;
                }
                else
                {
                    stack.pop();
                }
            }
        }
        
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++)
        {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}