class Solution 
{
    public String canonical(int[][] grid, ArrayList<Integer> shape) 
    {
        String ans = "";
        int lift = grid.length + grid[0].length;
        int[] out = new int[shape.size()];
        int[] xs = new int[shape.size()];
        int[] ys = new int[shape.size()];

        for (int c = 0; c < 8; ++c) {
            int t = 0;
            for (int z: shape) {
                int x = z / grid[0].length;
                int y = z % grid[0].length;
                //x y, x -y, -x y, -x -y
                //y x, y -x, -y x, -y -x
                xs[t] = c<=1 ? x : c<=3 ? -x : c<=5 ? y : -y;
                ys[t++] = c<=3 ? (c%2==0 ? y : -y) : (c%2==0 ? x : -x);
            }

            int mx = xs[0], my = ys[0];
            for (int x: xs) mx = Math.min(mx, x);
            for (int y: ys) my = Math.min(my, y);

            for (int j = 0; j < shape.size(); ++j) {
                out[j] = (xs[j] - mx) * lift + (ys[j] - my);
            }
            Arrays.sort(out);
            String candidate = Arrays.toString(out);
            if (ans.compareTo(candidate) < 0) ans = candidate;
        }
        return ans;
    }
    
    public int numDistinctIslands2(int[][] grid) 
    {
        int n = grid.length;
        if(n == 0) return 0;
        int m = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[n][m];
        Set<String> res = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(!visited[i][j] && grid[i][j] == 1)
                {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    dfs(grid, visited, n, m, i, j, i, j, list);
                    res.add(canonical(grid, list));
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