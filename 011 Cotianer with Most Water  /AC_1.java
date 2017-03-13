public class Solution
{
    public int maxArea(int[] height)
    {
        int start = 0, end = height.length -1;
        int area = 0, max = 0;
        for(int i = height.length-1; i> 0; i--)
        {
            if(height[start] > height[end])
            {
                if(height[end]*i>max) max = height[end]*i;
                end--;

            }
            else
            {
                if(height[start]*i>max) max = height[start]*i;
                start++;
            }

        }
        return max;
    }
}
