# 814. Binary Tree Pruning

We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)


### Note:

The binary tree will have at most 100 nodes.
The value of each node will only be 0 or 1.

## Solution: Recursion

THis is a easy qestion whihc can done by a normal recursion.

```
class Solution 
{
    public int countSum(TreeNode root)
    {
        int count = 0;
        if(root.left != null)
        {
            int count_left = countSum(root.left);
            if(count_left == 0) root.left = null;
            else count += count_left;
        }
        if(root.right != null)
        {
            int count_right = countSum(root.right);
            if(count_right == 0) root.right = null;
            else count += count_right;
        }
        count += root.val;
        return count;
        
    }
    public TreeNode pruneTree(TreeNode root) 
    {
        if(root == null)
        {
            return null;
        }
        int count = countSum(root);
        if(count == 0) return null;
        return root;
    }
}
```