# 028 Implement strStr()

Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

### Solution:

这道题题意很简单，就是寻找实现寻找字符串的匹配，即是实现strStr()这个函数。我这里首先用的暴力的方法直接比较字符串的首字母，如果相等再向后的进行比较，如果到最后相等的湖就返回。一开始有超时，但是我们稍微限制一下，比如再i+j>s.length()时跳出，这样很勉强的通过了。
