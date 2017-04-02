# 029 Divide Two Integers

Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.

### Solution:
这道题问题是在不用乘除模的前提下实现除法，最简单的方法肯定是不断减，但明显会超时。所以我考虑每次我们以除数的长度对被除数的同样长度做减法。比较麻烦的是对过界情况的处理，需要很小心才可以。

### Update1:
这道题我觉得更巧妙的是我们用2^n倍数来寻找最近的情况，然后每次和其一半进行比较，有点二分的思想在里面，我们之后遇到这种情况也要经常考虑用2的平方来处理。
