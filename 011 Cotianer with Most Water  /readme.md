# 011 Container With Most Water
>Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

>Note: You may not slant the container and n is at least 2.

### Solution:
这道题如果想明白的话还是挺简单的，给你一个数组，让你找到左右两个挡板容量最大，其实也就是找两个位置，保证 min(length[i],length[j])(j-i) 这个值是最大的，如果这个问题我们用暴力想的话是每一个挡板向后遍历看是否有挡板能得到最大值。我当时想到的一个优化的思路是从后向前遍历，如果当前值小于之前的最大值，就可以跳出。但是时间复杂度是平方的，会超时。

这道题想起了2-sum问题的，那个问题是寻找两个数的和，而这道题可以排序之后用左右两个指针遍历，我们可以证明这样可以保证找到恰好等于和的两个值。而这里我们也可以用两个指针从左右两端开始向中间开始遍历，因为遍历的过程中j-i的值是不断下降，所以我们只有寻找使得min(length[i],length[j])更大的情况。比如我们在左指针i向右移动时，只有遇到length[i]比length[j]的情况才会更新，我们才有可能得到更大的容量。我们假设我们错过了挡板k，但无论如果这个选择这个挡板得到的面积肯定不会比它左边的最大值length[i]大的。所以我们可以放心的用左右两个指针遍历就可以得到最大值。

这道题感觉最重要的就是想到左右两个指针遍历的方法，想到了就很简单，想不到的话就其实真的没办法。另外这道题感觉LeetCode编译器挺神奇的，同样的代码不同的方式写然后时间差距相当的大，因为这个在上面耗费了好多的时间。
