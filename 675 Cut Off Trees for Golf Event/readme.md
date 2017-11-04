#  675. Cut Off Trees for Golf Event

You are asked to cut off trees in a forest for a golf event. The forest is represented as a non-negative 2D map, in this map:

0 represents the obstacle can't be reached.
1 represents the ground can be walked through.
The place with number bigger than 1 represents a tree can be walked through, and this positive number represents the tree's height.
You are asked to cut off all the trees in this forest in the order of tree's height - always cut off the tree with lowest height first. And after cutting, the original place has the tree will become a grass (value 1).

You will start from the point (0, 0) and you should output the minimum steps you need to walk to cut off all the trees. If you can't cut off all the trees, output -1 in that situation.

You are guaranteed that no two trees have the same height and there is at least one tree needs to be cut off.

### Solution:

This is a problem which should make me streghth the operation of BFS. The problem is not easy to understand. The meaning of it is you should visite the tree by the value increases. So we should sort all the tree value and visit it one by one. But how we know we can get the next tree and the shortest path, we should use BFS to get the next tree and calculate the step.

The main problem is I am not fimiliar with BFS now, and afraid to use the BFS tree, this is a very weeken hand and I shold complete a BFS tree in 10 min. There are a lot of small problems happened in my problem. Such as visit the same node and insert same node at one opearation,  I should take care of this problem next time.
