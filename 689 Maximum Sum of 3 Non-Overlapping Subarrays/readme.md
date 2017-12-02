# 689. Maximum Sum of 3 Non-Overlapping Subarrays

In a given array nums of positive integers, find three non-overlapping subarrays with maximum sum.

Each subarray will be of size k, and we want to maximize the sum of all 3*k entries.

Return the result as a list of indices representing the starting position of each interval (0-indexed). If there are multiple answers, return the lexicographically smallest one.

### Solution:

This is a very good problem which teach me a lot. We can travel the array to record the biggest value in left and the biggest value in right. And the third time we can use the information we have known before. This is a thought of Dynamic programming.