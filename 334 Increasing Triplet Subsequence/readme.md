# 335. Self Crossing

Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Formally the function should:
Return true if there exists i, j, k 
such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
Your algorithm should run in O(n) time complexity and O(1) space complexity.



### Solution:

We can solve this problem by saving 2 variable: low1 and low2. low1 is record the the smallest number before now, the low2 is record the smallest number which have another smaller number before it and change value after finding a suitable low1. This solution is inspired by buying&selling stocks problems.
