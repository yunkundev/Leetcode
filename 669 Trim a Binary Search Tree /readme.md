# 669. Trim a Binary Search Tree

Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

### Solution:

 If the total root not in the [L,R], we should find the child bree bonctains [L,R]
 If the root is in the [L,R], we should find all the node in the left tree and right tree
