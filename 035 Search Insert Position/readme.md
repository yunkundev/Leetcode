#  35.Search Insert Position
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

[1,3,5,6], 5 → 2

[1,3,5,6], 2 → 1

[1,3,5,6], 7 → 4

[1,3,5,6], 0 → 0

### Solution:
最简单的二分搜索，唯一考虑情况是当遇到不存在元素时要找到放入的位置，在小于等于为判断条件的情况下，low所指向的位置就是我们要插入的位置。

