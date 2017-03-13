# 015 3Sum

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.


Note: The solution set must not contain duplicate triplets.


>For example, given array S = [-1, 0, 1, 2, -1, -4],

>A solution set is:

>[

>  [-1, 0, 1],

>  [-1, -1, 2]

>]

### Solution:
看到题目3Sum, 我立刻就想起了我当时阅读《Algorithm》的岁月了，当时3Sum是被当作例题来研究的，也的确是一道比较经典的题。但当时书里只是利用排序+二分将原来O(n^3)的时间复杂度降到来O(n^2logn)。而在之前的2Sum问题中我们可以利用左右夹壁的方法对排序后的数组寻找得到O(n)的方法，这样利用排序+左右夹壁我们可以很轻松的解决这个问题。
