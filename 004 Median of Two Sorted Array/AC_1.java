public class Solution
{
    public double calcuMedian(int s,int[] nums)
    {
        double re = 0.0;
        if( s%2 == 1)
        {
            int ind = (s+1)/2-1;
            re = nums[ind];
        }
        else
        {
            int ind = s/2;
            re = (double)(nums[ind-1]+nums[ind])/2;
        }
        return re;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {

        int m = nums1.length;
        int n = nums2.length;
        int s = m + n;
        if(m == 0)
        {
            return calcuMedian(s,nums2);
        }
        if(n == 0)
        {
            return calcuMedian(s,nums1);
        }

        int[] nums = new int[s];
        // merge the two array nums1 and nums2
        int i = 0, j = 0, k = 0;
        while(true)
        {

            if(nums1[i] < nums2[j])
            {
                nums[k++] = nums1[i++];
            }
            else
            {
                nums[k++] = nums2[j++];
            }

            if( i >= m || j >= n || k > s/2 +1 )
            {
                break;
            }
        }


        while( i < m )
        {
            nums[k++] = nums1[i++];
            if(k > s/2 ) break;
        }
        while( j < n )
        {
            nums[k++] = nums2[j++];
            if(k > s/2 ) break;
        }


        return calcuMedian(s,nums);
    }
}
