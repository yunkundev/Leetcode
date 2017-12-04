# 300. Longest Increasing Subsequence

Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?

# Solution:

The Longest Increasing Subsequence problem itself is not hard to write. But the most valuable thought is how can we solve this problem in O(nlogn) time. This is some similiar with KMP problem. The key to achieve this goal is to use a new array called tail to track the smallest number of increasing subsequence with lenght k. For example, tail[1] represent the increasing subsequence with length 1 and tail[k] represent the smallest tail number in all k length increasing subsequence. And in the same time, the tail array is sorted and we can easily find the position the new num to insert with binary search.