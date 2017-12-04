# 456. 132 Pattern

Given a sequence of n integers a1, a2, ..., an, a 132 pattern is a subsequence ai, aj, ak such that i < j < k and ai < ak < aj. Design an algorithm that takes a list of n numbers as input and checks whether there is a 132 pattern in the list.

Note: n will be less than 15,000.

### Solution:

This is really a good problem to let us think over. This is a hard problem than the 123 Pattern just before.

We should travel from the tail to the former. If we find the number bigger than tmp, we should store it in a varibale high1, and make the last high1 to high2. There is a another situation that if we get a number between the high1 and high2 and we get a new variable same with high1, we should replace the high2. The kernal of this problem is to keep two variable high1 and high2 to record the the biggest and the second biggest before the biggest and compare new number with that seconde biggest. This problem is hard to image and write, I should thingk over it.