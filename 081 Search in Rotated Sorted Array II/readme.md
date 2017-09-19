# 81. Search in Rotated Sorted Array II

Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Write a function to determine if a given target is in the array.

The array may contain duplicates.


### Solution:
思路基本和 33题 Search in Rotated Sorted Array相同，都是先判断旋转点位置再进行分情况讨论，唯一不同的地方是要对相等的情况进行特殊处理，将尾部元素减1以后再与mid做比较。