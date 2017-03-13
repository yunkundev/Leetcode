# 017 Remove Nth Node From End of List

Given a linked list, remove the nth node from the end of list and return its head.


>Given linked list: 1->2->3->4->5, and n = 2.

>After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:
Given n will always be valid.
Try to do this in one pass.

### Solution:
这道题之前我的一个好朋友面试遇到考过我，当时我一时没有想到方法，没想到在LeetCode中那么早就遇到了。这道题主要是有一个限制，只允许遍历一遍链表，这个就要求我们没办法去计算链表长度再确定走几步，我们只需要设置两个指针，让其中一个先走n步，然后再一起走，直到先走的到达终点，然后删去就可以了。

这道题因为之前知道答案所以能很快的A掉，如果一时没想到的话真的容易困住，然后觉得自己对于链表的基本操作也真的需要加强联系，平时用的太少。
