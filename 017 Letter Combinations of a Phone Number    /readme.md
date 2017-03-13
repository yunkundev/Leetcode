# 017 Letter Combinations of a Phone Number

>Given a digit string, return all possible letter combinations that the number could represent.

>A mapping of digit to letters (just like on the telephone buttons) is given below.

### Solution:
这道题其实就是是个模拟问题，直接用循环遍历一遍数字，然后组成对应的字符长就好的。这道题跟数字和罗马数字的转化有一个同样的问题，我们可以用数组内来表示各种情况，而去减少IF的使用，很多多个情况的表示可以直接转化为数组内的选取问题。
