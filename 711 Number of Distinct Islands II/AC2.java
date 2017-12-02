class Solution 
{   
    public int numDistinctIslands2(int[][] grid) 
    {
        int n = grid.length;
        if(n == 0) return 0;
        int m = grid[0].length;
        int count = 0;
        //System.out.println(m + " "+n);
        boolean[][] visited = new boolean[n][m];
        HashSet<List<Integer>> res = new HashSet<List<Integer>>();
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(!visited[i][j] && grid[i][j] == 1)
                {
                    List<Integer> list = new ArrayList<Integer>();
                    dfs(grid, visited, n, m, i, j, i, j, list);
                    int min_y = list.get(0)/m;
                    int min_x = list.get(0)%m;
                    int max_y = list.get(0)/m;
                    int max_x = list.get(0)%m;
                    for(int k = 1; k < list.size(); k++)
                    {
                        min_y = Math.min(min_y, list.get(k)/m);
                        min_x = Math.min(min_x, list.get(k)%m);
                        max_y = Math.max(max_y, list.get(k)/m);
                        max_x = Math.max(max_x, list.get(k)%m);
                    }
                    max_x = max_x - min_x;
                    max_y = max_y - min_y;


                    for(int k = 0; k < list.size(); k++)
                    {
                        list.set(k, list.get(k) - m*min_y -min_x);
                        
                    }
                    Collections.sort(list);
                    if(!set.contains(list))
                    {
                        res.add(list);
                        // System.out.println();
                        // for(int p:list) System.out.print(p+" ");
                        // System.out.println();
                        for(int p = 0; p < 8; p++)
                        {
                            List<Integer> trans = new ArrayList<Integer>();
                            for(int k = 0; k < list.size(); k++)
                            {
                                int x = list.get(k)%m;
                                int y = list.get(k)/m;
                                int tx = x, ty = y;
                                if(p%4 == 2 || p%4 == 3) tx = max_x-tx;
                                if(p%4 == 1 || p%4 == 3) ty = max_y-ty;
                                if(p >= 4)
                                {
                                    tx = y;
                                    ty = x;
                                    if(p%4 == 2 || p%4 == 3) tx = max_y-tx;
                                    if(p%4 == 1 || p%4 == 3) ty = max_x-ty;
                                }
                                
                                trans.add(ty*m + tx);
                                //System.out.print((ty*m + tx)+" ");
                            }//System.out.println();
                            
                            
                            Collections.sort(trans);
                            set.add(trans);
                        }
                        
                    }
                    
                }
            }
        }

        return res.size();
        
    }
    
    public void dfs(int[][] grid, boolean[][] visited, int n, int m, int i, int j, int i0, int j0, List<Integer> list)
    {
        if(i < 0 || i >= n || j < 0|| j >= m|| visited[i][j] || grid[i][j] == 0 ) return ;
        visited[i][j] = true;
        list.add(i*m + j);
        dfs(grid, visited, n, m, i-1, j, i0, j0, list);
        dfs(grid, visited, n, m, i+1, j, i0, j0, list);
        dfs(grid, visited, n, m, i, j-1, i0, j0, list);
        dfs(grid, visited, n, m, i, j+1, i0, j0, list);
    }
    
}