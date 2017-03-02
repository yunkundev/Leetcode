# 006 Zigzag conversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

### Example:

>P   A   H   N

>A P L S I I G

>Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

>string convert(string text, int nRows);

convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

### Solution:

这道题很简单，直接找规律就可以的。对于原来的输入，他们的行数分别是 0121012101210... 就是给每一个字符确认对应行数然后连接起来就可以了。

吐槽一下Leetcode的标记，这道题标的是Medium，然而比简单还要简单，上一道题还是Medium，难度完全不同，再也信不过这个标记了
