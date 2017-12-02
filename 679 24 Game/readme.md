# 24 Game

You have 4 cards each containing a number from 1 to 9. You need to judge whether they could operated through *, /, +, -, (, ) to get the value of 24.

### Solution:

This problem can easily get using Backtracking. The main problem is that we should consider the error happened in float/ java. In java 24.0 may not equals to 24.0 sometimes. We should use Math.abs(a-b)<0.0000001 to compare two float in java.