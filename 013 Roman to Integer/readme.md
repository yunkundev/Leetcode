# 013 Roman to Integer

>Given a roman numeral, convert it to an integer.

>Input is guaranteed to be within the range from 1 to 3999.

### Solution:
这道题和上一道题正好相反，难度也不大，就是把罗马数字转化成数字是了。唯一需要注意的是和上一道题一样需要注意代码的优化，我们可以利用数组或者是map等数据结构减少对if等判断语句的以来，使代码更加简练，唯一注意的是遍历时如果后一位比前一位大的话应该是遇到了4，9等特殊情况，注意一下就好的。
