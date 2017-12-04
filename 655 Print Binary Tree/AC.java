class Solution 
{
    public int treeHeight(TreeNode root)
    {
        if(root == null) return 0;
        else return Math.max(treeHeight(root.left), treeHeight(root.right))+1;
    }
    
    public void putTree(TreeNode root, int p, int h, int dif, List<List<String>> res)
    {
        if(root == null) return;
        List<String> tmp = res.get(h);
        tmp.set(p, String.valueOf(root.val)); 
        putTree(root.left, p - dif/2, h+1, dif/2,res);
        putTree(root.right, p + dif/2, h+1, dif/2, res);
    }
    
    public List<List<String>> printTree(TreeNode root) 
    {
        int height = treeHeight(root);
        int n = (2 << (height-1) )-1;
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < height; i++)
        {
            List<String> list = new ArrayList<String>();
            for(int j = 0; j < n; j++) list.add("");
            res.add(list);
        }
        putTree(root,n/2, 0, (n+1)/2, res);
        return res;
    }
}