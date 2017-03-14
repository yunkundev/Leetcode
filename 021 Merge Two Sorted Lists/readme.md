# 021 Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

### Solution:
这道题本身很简单，就是简单的归并而已，没有什么复杂的。主要的是这个是链表形式的，我实在有点不熟悉了，写的很慢很慢，是时候稍微借此复习一下链表形式了。

### Update1:

>public class ListNode

>{

>     int val;

>     ListNode next;

>     ListNode(int x) { val = x; }

>}

LeetCode上的ListNode的Java结构主要就是两个属性和一个构造函数构成，然乎是从head开始就里面就包含内容，我们这样就可以一个dummy head的节点指向头指针，避免我们判断头指针，最后返回dummy——>next即可。另一个值得注意的是尾指针就是最后一个指向NULL的指针，如果我们判断出一个node等于NULL的话，那他上一个就是尾指针的位置，当我们创建一个新的链表时也不要忘记最后加上NULL。 至于像插入删除之类的基本操作就比较简单，不细说了，等之后做完今天之后的3道题再慢慢熟练一些基本操作。
