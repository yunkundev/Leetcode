# 312. Burst Balloons

Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note: 
(1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
(2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100

### Solution:

Their are two very important thought in this problem, the first one is we can use dp[i][j] to represent the max value we can get, we can seperate the dp[i][j] to two part like dp[i][k-1], dp[k+1][j] we already know with dp. The second thought is that we can think the problem from top to bottom which means when consider the max value of dp[i][j], we already knows all the max value of dp[i][k-1] and dp[k+1][j]. And most importantly, all those dp[i][k-1] and dp[k+1][j] is all burst, so the result of this problem can be present as 

dp[i][j] = dp[i][k-1] + dp[k+1][j] + nums[i-1]xnums[k]xnums[j+1] 

which represent that all the balloon between i to k-1 and k+1 to j are already brust, the i-1, k, and k+1 is adjacent.