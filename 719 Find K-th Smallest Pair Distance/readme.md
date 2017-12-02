# 719 Find K-th Smallest Pair Distance

Given an integer array, return the k-th smallest distance among all the pairs. The distance of a pair (A, B) is defined as the absolute difference between A and B.

### Solution:

This is a typical problem to use binary search to find the value instead of index. Firstly, we can find the number of pair distance smaller than n using sliding windows using O(n) in sorted array. We can easily get the min distance and max distance, so the k-th smallest distance must in this range. We can use lower_bound binary search quickly find the value of distance.