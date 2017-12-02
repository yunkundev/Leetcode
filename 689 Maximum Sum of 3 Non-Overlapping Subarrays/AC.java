class Solution 
{
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) 
    {
        int n = nums.length;
        int[] left = new int[n];
        int tmp = 0;
        for(int i = 0; i < k; i++)
        {
            tmp += nums[i];
        }
        left[k-1] = tmp;
        for(int i = k; i < n; i++)
        {
            tmp += nums[i];
            tmp -= nums[i-k];
            left[i] = Math.max(tmp, left[i-1]);
        }
        
        // for(int i = 0; i < n; i++)
        // {
        //     System.out.print(left[i]+" ");
        // }System.out.println();
        
        int[] right = new int[n];
        tmp = 0;
        for(int i = n-1; i >= n-k; i--)
        {
            tmp += nums[i];
        }
        right[n-k] = tmp;
        for(int i = n - k - 1; i >= 0; i--)
        {
            tmp += nums[i];
            tmp -= nums[i+k];
            right[i] = Math.max(tmp, right[i+1]);
        }
        
        // for(int i = 0; i < n; i++)
        // {
        //     System.out.print(right[i]+" ");
        // }System.out.println();
        
        int start = k;
        int end = 2*k-1;
        tmp = 0;
        for(int i = start; i <= end; i++)
        {
            tmp += nums[i];
        }
        int max = 0;
        int max_start = 0;
        int max_left = 0;
        int max_right = 0;
        while(end < n - k)
        {
            int sum = tmp + left[start-1] + right[end+1];
            if(sum > max)
            {
                max = sum;
                max_start = start;
                max_left = left[start-1];
                max_right = right[end+1];
            }
            tmp -= nums[start];
            start++;
            end++;
            tmp += nums[end];
        }
        int[] res = new int[3];
        res[1] = max_start; 
        //System.out.println(max_start + " "+ max_left + " "+max_right);
        for(int i = k-1; i < n; i++)
        {
            if(left[i] == max_left) 
            {
                res[0] = i-k+1;
                break;
            }
        }
        for(int i = n -k; i >= 0; i--)
        {
            if(right[i] == max_right)
            {
                res[2] = i;
                break;
            }
        }
        return res;
    }
}