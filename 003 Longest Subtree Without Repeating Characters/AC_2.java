public class Solution
{
        // delete the first n element in an array
    public static int[] deleteItems(int n, int[] nums)
    {
        int[] newarray = new int[nums.length - n];
        for(int i = 0; i < nums.length - n;i++)
        {
            newarray[i] = nums[i + n];
        }
        return newarray;
    }

    // Funcaiton to find the kth least elment
    public static double findKthLeast(int k, int[] nums1, int[] nums2)
    {
        if( nums1.length == 0 ) return nums2[k-1];
        if( nums2.length == 0 ) return nums1[k-1];



        if(k == 1)
        {
            if(nums1[0] > nums2[0]) return nums2[0];
            else return nums1[0];
        }
        int lbl1,lbl2;
        if(k/2 <= nums1.length) lbl1 = k/2;
        else lbl1 = nums1.length;
        if(k%2 == 0)
        {
        	if(k/2 <= nums2.length) lbl2 = k/2;
            else lbl2 = nums2.length;
        }
        else
        {
        	if(k/2+1 <= nums2.length) lbl2 = k/2+1;
            else lbl2 = nums2.length;
        }


        System.out.println(lbl1+" "+lbl2);
        if(nums1[lbl1-1] == nums2[lbl2-1]&&(k/2 <= nums1.length)&&(k/2 <= nums2.length) ) return nums1[lbl1-1];
        else if(nums1[lbl1-1] > nums2[lbl2-1]) return findKthLeast(k-lbl2, nums1, deleteItems(lbl2, nums2) );
        else return findKthLeast(k-lbl1, deleteItems(lbl1, nums1), nums2);

    }

    //change problem to find the kth least number in two array
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int s = nums1.length + nums2.length;
        double res = 0.0;
        // the total number of two array is a odd number
        if (s%2 == 1) res = findKthLeast((s+1)/2, nums1, nums2);
        else res = ( findKthLeast(s/2, nums1, nums2) + findKthLeast(s/2+1, nums1, nums2) )/2;
        return res;
    }
}
