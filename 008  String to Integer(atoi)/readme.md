# 008 String to Integer(atoi)

Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

### Solution:

这道题可以说是看起来非常简单的一道题，就是将我们读到的数字字符串转化成数字，思路就是从头到位依次读入字符，然后进行转化。 这道题通过率很低的原因是因为有许多许多特殊情况要考虑，很难一次性的去把所有输入的情况都考虑全。 比如上一题说过的int类型的数字越界问题，再比如对空格的处理和对加减号的处理，这道题就仔细点应该就没什么太大问题。
