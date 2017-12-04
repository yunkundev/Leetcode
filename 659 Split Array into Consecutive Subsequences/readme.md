# 659. Split Array into Consecutive Subsequences

You are given an integer array sorted in ascending order (may contain duplicates), you need to split them into several subsequences, where each subsequences consist of at least 3 consecutive integers. Return whether you can make such a split.

### Solution:

The key thought of this problem is that any one of the number is whether belong to the former and belong to the later. The string have a length of 3 so if any number is so large and it bigger than the former and later support, you can return false.