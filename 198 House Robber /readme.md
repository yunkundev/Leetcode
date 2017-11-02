# 198. House Robber

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.


### Solution:
This is a very typical Dynamic programming. We just think what the most moneny we can rob in the the house i. We can get the most money whether we rob the house or not.

DP[i] = Max(DP[i-1], DP[i-2] + nums[i]);