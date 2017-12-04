# 324. Wiggle Sort II

Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....

Example:
(1) Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6]. 
(2) Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].

Follow Up:
Can you do it in O(n) time and/or in-place with O(1) extra space?

### Solution:

This problem is little different from the problem "Wiggle Sort" which it allow the same number in array. This make problem much harder than former. Mostly because the 2-sort problem become 3-sort problem. The main idea is to put the number smaller than Median in the odd position and put the number bigger than Median in the even position. But due to the sam number allowed, we should consider the position of the number same with the median number. The only place we can place them is in the left place of odd and even number. We should use the thought in 3-color problem and use 3-index to remain the position the next bigger/smaller/equal number to put.s