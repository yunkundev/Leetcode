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
这道题我其实就是因为leetcode对时间和空间限制不那么严格的原因，用一个优化过的暴力解法直接暴力过了，真实难度应该还挺难的。我的解法是对其中的每一个字符向两边进行搜索，是O(n^2)的复杂度，很勉强的过了。*{ AC_1.java }* 
