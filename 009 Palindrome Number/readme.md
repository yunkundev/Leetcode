# 009 Palindrome Number

Determine whether an integer is a palindrome. Do this without extra space.

### Solution:
感觉这道题也不是很难，可能难点在它限制了我们不能用多余的空间上吧。这道题一开始自己想的是一点多余空间都不用，这其实是不可能的。这里的extra space应该指的是O（1）,限制我们不能用字符串的方法或者说不能存储每一位。那我们只能利用循环来一次一次的比较。先找到最头的数字和最尾部的数字，每次比较对应的两个位子的数，然后一个前移一位一个后移一位即可。简单题。
