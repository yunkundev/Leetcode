# 023 Merge k Sorted Lists

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

### Solution:
这道题简直是我的悲惨世界，自己在众多路中选择路一种最难的办法，一开始看到这个问题想的太复杂了。我当时一看是n路归并就立刻想到用堆，脑海中立马出现的是把n路链表的头放在堆里进行排序，我直接的想法是将原来每个链表第一个最小的元素放入数组中，然后依次删掉最小元素，然后将该列表的下一个元素放入就可以了。但主要问题就出来，如何去寻找原来的元素，我原来想用HashMap去寻找原来链表，但是又出现了重复key值问题，如果key值出现重复但话无法直接用HashMap，如果直接寻找就肯定超时，最后没办法笨拙的用了HashMap来找到ArrayList，最后用PriorityQueue，HashMap，ArrayList三个复杂结构才勉强完成来这道题。
