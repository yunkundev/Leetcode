# 003 Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

###Examples:

>Given "abcabcbb", the answer is "abc", which the length is 3.

>Given "bbbbb", the answer is "b", with the length of 1.

>Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

###solution:

看到这道题的第一时间我所想起的是分治，但是分治之后问题并没有得到简化，找不到一个简单的方式来解决它。

然后就想了一下正常人是如何解决这个问题，如果我们从头开始出发，记录我们所有遇到的字符，如果遇到了与之前重复的字符，就记录这个字符串，然后从这个重复字符串的上一个重新开始查找会
