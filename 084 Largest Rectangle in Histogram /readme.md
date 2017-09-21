# 84. Largest Rectangle in Histogram

Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.


Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].


The largest rectangle is shown in the shaded area, which has area = 10 unit.

For example,
Given heights = [2,1,5,6,2,3],
return 10.

### Solution:
This is a very exquisite problem with solved by increas only stack. If the next one i is bigger than the top of stack, we just put that one into the stack. If the next one is less than the top of stack, we should pop the the top with the index j. At the same time, we can calculate the erae which the height is heights[j]. The width of the erea is i- stack.peek(). Hense we can calculate the erea of all the rectangles and find the largest one.