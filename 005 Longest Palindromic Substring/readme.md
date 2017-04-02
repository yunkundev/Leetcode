# 005 Longest Palindromic Substring

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

### Example:

>Input: "babad"

>Output: "bab"

>Note: "aba" is also a valid answer.

### Example:

>Input: "cbbd"

>Output: "bb"

### Solution:

这道题是比较经典的回文子串问题，在之前用动规写过一次，打算周末补完课程内容再加上动规解法。
这道题我其实就是因为LeetCode对时间和空间限制不那么严格的原因，用一个优化过的暴力解法直接暴力过了，真实难度应该还挺难的。我的解法是对其中的每一个字符向两边进行搜索，是O(n^2)的复杂度，很勉强的过了。*{ AC_1.java }*

### Update1: 动规做法
终于把动规这个漏洞给补上了，自己算法方面这样也没有太大的漏洞啦。

这道题其实可以用动规来解决。我们首先确定子问题，p[i, j]表示s[i],...,s[j]是不是一个回文字符串，我们可以得到递推方程：

   if s[i] == s[j]  p[i, j] = p[i-1, j-1];

   else p[i, j] = false;

我们首先把所有的p[i, i]设为true, 然后逐渐计算p[i, i+k]。像我们计算这种i，j表示的是数组两端的情况，注意我们循环的第一层表示的是i和j之间的距离，这样我们可以逐渐得到p[0,n]的子问题。

每一次我们得到为true的情况，更新我们记录的最大值，就可以得到最长的回文字符串。

自己在LeetCode上的第一道动规题，记录一下！
