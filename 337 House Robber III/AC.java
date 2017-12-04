class Solution 
{
    public int robbed(TreeNode root)
    {
        if(root == null) return 0;
        return rob(root.left) + rob(root.right);
    }
    public int rob(TreeNode root) 
    {
        if(root == null) return 0;
        return Math.max(robbed(root.left)+ robbed(root.right) + root.val, rob(root.left)+rob(root.right));
    }
}