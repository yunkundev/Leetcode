# 004 Median of Two Sorted Array
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

### Example 1:
>nums1 = [1, 3]

>nums2 = [2]

>The median is 2.0

### Example 2:
>nums1 = [1, 2]

>nums2 = [3, 4]

>The median is (2 + 3)/2 = 2.5

### Solution:

这道题卡了我好久，主要问题是我跟之前做过的一道题搞混了，老是理所当然的想用二分法，然后在奇偶问题上捣鼓不清，一天也没搞出来。 最简单的思路是用归并merge两个数组，然后去找中位数。虽然能过，但是是线性复杂度不满足题目要求，先留一下，等明天起来再接着想。
