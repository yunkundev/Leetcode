#315. Count of Smaller Numbers After Self

You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

### Solution:

This problem about to find the number of smaller elements in the left hand. It is easy to use staight forward method to solve this problem, but overtimes. We should find O(nlogn) method to solve this problem. 

The first method we can use is Binary Search Tree. Every time you get a new number, if it is smaller, we should insert it into the left tree and replace the number of smaller number. If it is bigger, we should add the smaller number to the node we want to insert and continue to insert in right tree.

The second method is sometimes more hard to think. The numbers of smaller array in the left is equal to the exchange time in the sort. We should consider the process of sorting and count the time of the exchange time. The Merge sort may be the easy one to do the sort and count.