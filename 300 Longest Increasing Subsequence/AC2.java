class Solution 
{
    public int lengthOfLIS(int[] nums) 
    {
        int n = nums.length;
        int[] last = new int[n+1];
        last[0] = Integer.MIN_VALUE;
        int size = 0;
        for(int i = 0; i < n; i++)
        {
            int num = nums[i];
            if(num > last[size])
            {
                size++;
                last[size] = num;
            }
            else
            {
                int start = 1;
                int end = size;
                //System.out.println(start + " "+ end + " "+num);
                while(start <= end)
                {
                    
                    int mid = (start + end)/2;
                    if(last[mid] == num) {start = mid; break;}
                    else if(last[mid] > num) end = mid-1;
                    else start = mid + 1;
                }
                //System.out.println(start);
                last[start] = num;
            }
            // for(int j:last) System.out.print(j +" ");
            // System.out.println();
        }
        return size;
    }
}