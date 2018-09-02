# 426. Convert Binary Search Tree to Sorted Doubly Linked List

## My Solution(AC1)

This qeustion is about to convert the the BST to Doubly Linked List, the basic idea is  using **inorder traversal** and make links between the current node and previous node.

The reason we can do this is because for any condition in inorder traversal, the previos node's right child already push in the stack(function), we can link the previous node's left with the current node. For the same reason, we can link the current node's right with the previous node.

There are two points which we should take care of:

1. The link between the first node and the last node 
> I use the iterative function find the last and assign it to the first prev value

2.  How to judge the end situation due to avoid list's ring
> When we visit the first node second time, we  assume that it's the end of our loop

## Improve1(AC2)

**Disscuss:**
https://leetcode.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/discuss/149151/Concise-Java-solution-Beats-100


There are still several points I need to improve compared with Discuss's solution:

**Using the dummy node to avoid the corner case which need find the last node and end condition**	


## Improve2(AC3)

We can use iteration instead of recursion to avoid global value.

**Becareful:** Inorder Tree Traversal(Interative)

We not regard tree likes a tree, we regard tree likes a lot of nodes which visit one by one. And everytime you visit a new node, you insert it into our linked list.



## Improve3

**GeeksforGeeks:** 
https://www.geeksforgeeks.org/convert-a-binary-tree-to-a-circular-doubly-link-list/

This problem can thought as Divide and Conquer problem. If we convert both left/right child tree to double linked list, we can easily connect these three double linked list into one after change the root node by link left and right to the node itself.

