# 664. Strange Printer

There is a strange printer with the following two special requirements:

The printer can only print a sequence of the same character each time.
At each turn, the printer can print new characters starting from and ending at any places, and will cover the original existing characters.
Given a string consists of lower English letters only, your job is to count the minimum number of turns the printer needed in order to print it.

### Solution:

This problem can solved by Dynamic programming. We can use dp[i][j] to represent the min step of print. And it can split to dp[i][k] and dp[k+1][j], and if the start of these two String is same, we should -1 because we can print there two base with 1 char.