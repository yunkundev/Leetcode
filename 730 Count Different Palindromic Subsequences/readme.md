# 730. Count Different Palindromic Subsequences

Given a string S, find the number of different non-empty palindromic subsequences in S, and return that number modulo 10^9 + 7.


A subsequence of a string S is obtained by deleting 0 or more characters from S.


A sequence is palindromic if it is equal to the sequence reversed.


Two sequences A_1, A_2, ... and B_1, B_2, ... are different if there is some i for which A_i != B_i.


The length of S will be in the range [1, 1000].
Each character S[i] will be in the set {'a', 'b', 'c', 'd'}.

### Solution:

This is not a easy question which is hard to think about the situation. The main thought of this question is that we considered all the palindromic is a__a, b__b, c__c, d__d and the number of subsequences is the number of 'a', 'b', 'c', 'd' and the next one have contains a__a, b__b, c__c, d__d and plus the situation "" which can remove ine final time.

so dp[i][j] = dp[xi][xj] (the closest and equal a, b,c ,d) + Num (the number of appearance in a, b, c, d) + 1(null string);
