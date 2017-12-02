# 727. Minimum Window Subsequence

Given strings S and T, find the minimum (contiguous) substring W of S, so that T is a subsequence of W.

If there is no such window in S that covers all characters in T, return the empty string "". If there are multiple such minimum-length windows, return the one with the left-most starting index.

### Solution:

The String problem using DP is somethings confus me. This is not a hard problem and you can use this problem directly. But the DP solution should let us think more. 

We can using a dp[i][j] to record to get the j of T, the shortest length we can from i. 

dp[i][j] = dp[i-1][j-1] + 1(if S(i) == T(j))

dp[i][j] = dp[i-1][j]+1;(if S(i) != T(j))