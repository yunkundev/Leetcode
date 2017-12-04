#  337. House Robber III

The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

Determine the maximum amount of money the thief can rob tonight without alerting the police.

### Solution:

The thought of this problem is very similiar with other House Robber problem but we should very careful about the unique character of tree. The choosen of one node just contruct for you cannot choose any one of two child node.