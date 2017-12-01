# 685. Redundant Connection II

In this problem, a rooted tree is a directed graph such that, there is exactly one node (the root) for which all other nodes are descendants of this node, plus every node has exactly one parent, except for the root node which has no parents.


The given input is a directed graph that started as a rooted tree with N nodes (with distinct values 1, 2, ..., N), with one additional directed edge added. The added edge has two different vertices chosen from 1 to N, and was not an edge that already existed.


The resulting graph is given as a 2D-array of edges. Each element of edges is a pair [u, v] that represents a directed edge connecting nodes u and v, where u is a parent of child v.


Return an edge that can be removed so that the resulting graph is a rooted tree of N nodes. If there are multiple answers, return the answer that occurs last in the given 2D-array.

### Solution:

This is a tricky problem which we should very clear about the situation of the directed graph connection. If we can gain a tree by remove one edge, there are three possibility.

1, No loop, but there is one node who has 2 parents.

2, A loop, and there is one node who has 2 parents, that node must be inside the loop.

3, A loop, and every node has only 1 parent.  

We can solve this problem by classified discussion.

