# 026 Remove Duplicates from Sorted Array

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

### example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length

### Solution：
真是一道简单题也没有什么太好说的，就是遍历的过程中删去所有的重复元素。值得注意的是我们需要更改原来的数组来保存更改的内容。
