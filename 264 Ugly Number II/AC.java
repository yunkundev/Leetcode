class Solution 
{
    public int nthUglyNumber(int n) 
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] nums = new int[1690];
        nums[0] = 1;
        int index = 0;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        while(true)
        {
            index++;
            int ans = 0;
            int p2 = nums[index2] * 2;
            int p3 = nums[index3] * 3;
            int p5 = nums[index5] * 5;
            if(p2 <= p3 && p2 <= p5)
            {
                ans = p2;
                index2++;
            }
            if(p3 <= p2 && p3 <= p5)
            {
                ans = p3;
                index3++;
            }
            if(p5 <= p2&& p5 <= p3)
            {
                ans = p5;
                index5++;
            }
            nums[index] = ans; 
            if(index == n-1) break;
        }
        return nums[n-1];
    }
}