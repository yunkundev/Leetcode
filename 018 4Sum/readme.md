# 018 4Sum

Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.


Note: The solution set must not contain duplicate quadruplets.

>For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

>A solution set is:

>[

>  [-1,  0, 0, 1],

>  [-2, -1, 1, 2],

>  [-2,  0, 0, 2]

>]

### Solution:
这道题也没有太好的办法，我直接用的两次循环加左右夹壁，然后害怕通不过就通过对前两次循环进行来一下限制，如果已经比target大了而且之后全是正数的话我们就停止循环，最后通过来测试，思路基本和3Sum是相同的。
