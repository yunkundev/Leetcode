# 001 Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

### Example:
>Given nums = [2, 7, 11, 15], target = 9,

>Because nums[0] + nums[1] = 2 + 7 = 9,

>return [0, 1].

### Solution

看到这道题第一感觉是暴力n^2, 竟然直接就过了  *{AC_1.java}*。。。这可能就是Leetcode和以前做过的ACM的题目的区别吧，限制太宽了

2SUM和3SUM问题之前在普林斯顿的算法书当作时间复杂度的例题讲过，所以也算比较熟悉。

脑子中最直接的想法就是排序+二分，将原来的数组排序之后用二分查找 target-num, 但最多能够实现O(nlogn)   *{AC_2.java}* 在LeetCode上测试也从52ms降到了9ms

#### Update1
后来突然想到当时看算法书的时候还没学BinarySearch, 当时应该是用的前后两个指针向中间交替逼近，总和大的话右指针往左移，小了的话左指针往右移。 *{AC_3.java}* 以在O(n)的时间内实现对有序数组的Two Sum问题，但是由于需要第一步排序，时间复杂度还是O(nlogn)，不过时间是6ms前%2了，应该算是一个很优的解法了。

#### Update2
在网上看了看SoulMachine大神的解法，收到了很大的启发；将数组内元素插入Hash表中，检查目标值与当前值的差值是否在Hash表 *{AC_4.java}*。思路很清楚，代码也很简练，因为用了Hash表，所以时间复杂度为O(n)，虽然对于这个问题没有算法3快，但是解法给人启发很大，尤其是对Hash的使用上。
