### 034 Search for a Range 

Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].

Solution:

这道题其实就是二分搜索中的lower_bound和upper_bound的结合，用一个lower_bound和一个upper_bound找到数组的上下边界就可以的，这道题对于我来说主要问题就在于对于lower_bound和upper_bound的使用问题，确定一个相对稳定的二分查找写法然后固定下来这样的话以后也简单一些的。

Binary Search:
while(left <= right)
{
    mid = left + (right - left)/2;
    if( nums[mid] == target) return true;
    else if( nums[mid] > target ) right = mid - 1;
    else left = mid + 1;
}


lower bound:
while(left < right)
{
    mid = left + (right - left)/2;
    if( nums[mid] == target ) right = mid;
    else if( nums[mid] > target ) right = mid - 1;
    else left = mid + 1;
}
if(nums[left] == target ) return left;
else return -1;


upper bound:
while(left < right)
{
    mid = left + (right - left)/2;
    if(nums[mid] == target) left = mid;
    if( nums[mid] == target ) right = mid;
    else if(nums[mid] > target)  right = mid - 1;
    else left = mid + 1;
}
if(nums[left] ==  target) return left;
else return -1;


