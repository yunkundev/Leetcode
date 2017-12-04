class Solution 
{
    public void dfs(int[][] M, int i,boolean[] visited)
    {
        int n = M.length;
        for(int j = 0; j < n; j++)
        {
            if(M[i][j] ==1 && !visited[j])
            {
                visited[j] = true;
                dfs(M, j, visited);
            }
        }
    }
    public int findCircleNum(int[][] M) 
    {
        int n = M.length;
        if(n == 0) return 0;
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                dfs(M, i, visited);
                count++;
            }
                
        }
        return count;
        
    }
}