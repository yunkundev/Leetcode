# 581. Shortest Unsorted Continuous Subarray

Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

### Solution

The straight forward solution is sort and compare. But we can easily solve this problem with 2 pass. In the first pass, we should keep the max form 0 to n-1 and find from which index there are no position with nums[index] < max; the another pass is from n-1 to 0 to find the no index > min.