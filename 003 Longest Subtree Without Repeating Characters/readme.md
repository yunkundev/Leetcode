# 003 Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

### Examples:

>Given "abcabcbb", the answer is "abc", which the length is 3.

>Given "bbbbb", the answer is "b", with the length of 1.

>Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

### solution:

看到这道题的第一时间我所想起的是分治，但是分治之后问题并没有得到简化，找不到一个简单的方式来解决它, 所以开始考虑其他方法。

最直接的思路是我从头开始找，遇到字符记录下来，如果遇到重复字符，那么这个时候最长无重复字符串就应该是从头到这个重复字符的长度，如果我们还想要继续遍历的话，就不能存在上一个相同字符，就必须从它的下一个位置当作起点再继续向前读取比较。

一开始当我遇到重复字符时选择的时从上一个重复字符的下一个位置开始重新扫一遍，这样的话有许多的元素会被扫了无数遍，最坏情况会达到O(n^2)，这样肯定会超时。然后之后改为删去上一个重复字符前的所有字符，利用HashMap可以达到O(2^n)。 *{AC_1.java}*

后来跟网上的代码做了一下对比，发现自己还是愚蠢了一点，其实根本需要对那些字符进行什么插入删除的操作，我们需要做的就是记录一个起始点的坐标，只有在起始坐标之后的元素我们才认为是在当前最大字串里，只要一个字符的上一个重复字符在起始之后，就可以保证不会出现重复的情况，这样的话又会节约好多的时间。 *{AC_2.java}*
