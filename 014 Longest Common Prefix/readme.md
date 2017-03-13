# 014   Longest Common Prefix
>Write a function to find the longest common prefix string amongst an array of strings.

### Solution:
这道题一开始看错了，以为是要求找一个数组中任意两个字符串中最长的前缀，这样的问题复杂了很多很多，但后来看是寻找Common的最长前缀，这样问题就很简单了。有横向比较和纵向比较两种方法，我们选择了横向比较的方法，每次比较每一个字符串的每一位，直到出现不一样的或者出现遍历完字符串的情况出现。
