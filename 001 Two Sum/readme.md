# 001 Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

### Example:
>Given nums = [2, 7, 11, 15], target = 9,

>Because nums[0] + nums[1] = 2 + 7 = 9,

>return [0, 1].

### Solution

看到这道题第一感觉是暴力n^2, 竟然直接就过了  *{TwoSum_1.java}*。。。这可能就是Leetcode和以前做过的ACM的题目的区别吧，限制太宽了

2SUM和3SUM问题之前在普林斯顿的算法书当作时间复杂度的例题讲过，所以也算比较熟悉。

脑子中最直接的想法就是排序+二分，将原来的数组排序之后用二分查找 target-num, 但最多能够实现O(nlogn)   *{TwoSum_2.java}* 在LeetCode上测试也从52ms降到了9ms
