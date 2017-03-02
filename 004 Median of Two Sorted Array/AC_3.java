public class Solution
{
    //s1: the start point of array n1, s2 the start of array n2
    public double findKth(int k, int s1, int[] n1, int s2, int[] n2)
    {
        int len1 = n1.length - s1;
        int len2 = n2.length - s2;
        // n2 always shorter than n1
        if(len1 > len2) return findKth(k,s2,n2,s1,n1);
        // if n1 is empty
        if(len1 == 0) return n2[s2 + k - 1];
        // if only one element left
        if(k == 1) return Math.min(n1[s1], n2[s2]);
        int f1 = Math.min(k/2,len1);
        int f2 = k - f1;
        if(n1[ s1+f1-1 ] == n2[ s2+f2-1 ]) return n1[ s1+f1-1 ];
        else if(n1[ s1+f1-1 ] < n2[ s2+f2-1 ]) return findKth(k-f1, s1+f1, n1, s2, n2);
        else return findKth(k-f2, s1, n1, s2 + f2, n2);

    }



    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int total = nums1.length + nums2.length;
        if(total%2 == 1) return findKth((total+1)/2, 0, nums1, 0, nums2) ;
        else return (findKth(total/2, 0 ,nums1, 0, nums2)+findKth(total/2+1, 0, nums1, 0, nums2))/2.0;
    }
}
