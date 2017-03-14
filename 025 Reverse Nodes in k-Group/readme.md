# 025 Reverse Nodes in k-Group

Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

You may not alter the values in the nodes, only nodes itself may be changed.

Only constant memory is allowed.

For example,
Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5

### Solution:
这道题就是上一题的强化版，这次需要考虑k个连续反转的情况，我们需要的是先找到第k个元素，然后让k个中第一个指针指向他下一个，起始指针指向第k个，最后只需要对这k个元素从头到位进行一次反转就可以了。唯一的问题是建立了太多的临时变量来保存当前值，否则思路还是有点混乱，起始本身用不着那么多的变量的。
