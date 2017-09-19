# 33. Search in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

### Solution:
这道题主要考的是二分，需要先确定数列排列的形状然后再考虑Target的范围情况，尤其是临界点的各种情况，相等的各种情况需要考虑准确些。