# 560. Subarray Sum Equals K

Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

### Solution:

This problem is look like silding windows problem but it will not work because the existence of negetive number. There is a very very useful skill called presum(). We can travel from the first index to the last index can calculate the sum between them. And we can easily find whether there exist a sum - k and get the number of it in before with HashMap. I should aften think about the problem can be solved with presum() with deal with interval sum.