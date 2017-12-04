class Solution 
{
    HashMap<String, Integer> map;
    List<TreeNode> res;
    public String postOrder(TreeNode root)
    {
        if(root == null) return "null";
        String treeStr =  String.valueOf(root.val)  + "/"  + postOrder(root.left)  + "\\" + postOrder(root.right);
        //System.out.println(treeStr);
        if(map.containsKey(treeStr))
        {
            if(map.get(treeStr) == 1)
            {
                map.put(treeStr, 2);
                res.add(root);
            }
            
        }
        else map.put(treeStr, 1);
        return treeStr;
    }
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) 
    {
        map = new HashMap<String, Integer>();
        res = new ArrayList<TreeNode>();
        postOrder(root);
        return res;
    }
}