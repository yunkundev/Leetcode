#  673. Number of Longest Increasing Subsequence

Given an unsorted array of integers, find the number of longest increasing subsequence.

Example 1:

Input: [1,3,5,4,7]

Output: 2

Explanation: The two longest increasing subsequence are [1, 3, 4, 7] and [1, 3, 5, 7].

Example 2:

Input: [2,2,2,2,2]

Output: 5

Explanation: The length of longest continuous increasing subsequence is 1, and there are 5 subsequences' length is 1, so output 5.

Note: Length of the given array will be not exceed 2000 and the answer is guaranteed to be fit in 32-bit signed int.

### Solution:

This a problem whihc little transfer form the Longest Increasing Subsequence. In the the Longest Increasing Subsequence, we just need to calculate the longest Increasing Subsequence. In this problem, we should also calculate the the number of the longest subsequence. So we need more information about the the increasing subsequence. We used a another array maxnum to record the number of array with the longest length. The dp later who want to use this start to get the longest length should also have the maxnum solutions to get the same answer.
