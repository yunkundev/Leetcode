# 255. Verify Preorder Sequence in Binary Search Tree

Given an array of numbers, verify whether it is the correct preorder traversal sequence of a binary search tree.

You may assume each number in the sequence is unique.

Follow up:
Could you do it using only constant space complexity?

### Suolution:

This problem is ask about the sequence of the preorder traversal. We should know that if a sequence is done by preorder sequence, it should have a tuning point which before this point, all the value is small than this value; After this point, all the value is big than this value.
