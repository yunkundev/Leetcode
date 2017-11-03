class Solution
{
    public void dfs(TreeNode root, PriorityQueue<Integer> pq)
    {
        if(root == null) return;
        pq.add(root.val);
        dfs(root.left, pq);
        dfs(root.right, pq);
    }
    public int findSecondMinimumValue(TreeNode root)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        dfs(root, pq);
        int prev = pq.poll();
        int res = -1;
        while(pq.size() != 0 )
        {
            if(pq.peek() != prev)
            {
                res = pq.peek();
                break;
            }
            pq.poll();
        }
        return res;
    }
}
