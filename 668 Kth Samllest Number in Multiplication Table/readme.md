# 668. Kth Smallest Number in Multiplication Table

Nearly every one have used the Multiplication Table. But could you find out the k-th smallest number quickly from the multiplication table?

Given the height m and the length n of a m * n Multiplication Table, and a positive integer k, you need to return the k-th smallest number in this table.

### Solution:

This is a very good problem which we should think over it. It use binary search to find the first Number whihc have more than K number smaller than it. It is a transform form the preverse question which just to make the compare become i*j.
