class Solution
{
    static class TreeNode
    {
        TreeNode left, right;
        int val;
        int smaller;
        public TreeNode(int v, int s)
        {
            val = v;
            smaller = s;
        }
    }
    
    
    public TreeNode insert(TreeNode root, int tmp, int count, int[] res, int i)
    {
        
        if(root == null) 
        {
            res[i] = count;
            return new TreeNode(tmp, 0);
        }
        //System.out.println(root.val + " "+ root.smaller+ " " +count);
        if(tmp > root.val)
        {
            count += root.smaller + 1;
            root.right = insert(root.right, tmp, count, res, i);
        }
        else
        {
            root.smaller++;
            root.left = insert(root.left, tmp, count, res, i);
        }
        
        return root; 
    }
    
    public List<Integer> countSmaller(int[] nums)
    {
        int n = nums.length;
        TreeNode root = null;
        int[] res = new int[n];
        for(int i = nums.length -1; i >= 0; i--)
        {
            int count = 0;
            root = insert(root, nums[i], count, res, i);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i:res) list.add(i);
        return list;
    }
}