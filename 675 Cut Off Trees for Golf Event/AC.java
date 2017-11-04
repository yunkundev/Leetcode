class Solution
{
    int[][] around = {{0,1},{0,-1},{1,0},{-1,0}};
    public int BFS(int[][] board, int m, int n, int tmpi, int tmpj, int nexti, int nextj)
    {
        //System.out.println(tmpi + " " +tmpj + " " + nexti + " "+nextj);
        boolean[][] visited = new boolean[m][n];
        List<Integer> list = new ArrayList<Integer>();
        list.add(tmpi*n + tmpj);
        int step = 0;
        while(list.size() > 0)
        {
            // for(int i: list)
            // {
            //     System.out.print(i+" ");
            // }System.out.println();
            List<Integer> new_list = new ArrayList<Integer>();
            for(int p:list)
            {
                if(p == nexti * n + nextj)
                {
                    return step;
                }
                else
                {
                    if(visited[p/n][p%n]) continue;
                    for(int i = 0; i < 4; i++)
                    {
                        int pi = p/n + around[i][0];
                        int pj = p%n + around[i][1];
                        if(pi >= 0 && pi < m && pj >= 0 && pj < n && board[pi][pj] >= 1 && !visited[pi][pj])
                        {
                            new_list.add(pi*n + pj);
                        }
                    }
                    visited[p/n][p%n] = true;
                }
            }
            
            step ++;
            list = new_list;
        }
        return -1;
        
    }
    
    public int cutOffTree(List<List<Integer>> forest)
    {
        int m = forest.size();
        if(m == 0) return 0;
        int n = forest.get(0).size();
        int[][] board = new int[m][n];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < m; i++)
        {
            List<Integer> list = forest.get(i);
            for(int j = 0; j < n; j++)
            {
                board[i][j] = list.get(j);
                if(board[i][j] > 1) pq.add(board[i][j]);
                map.put(board[i][j], i*n + j);
            }
        }
        
        int tmpi = 0;
        int tmpj = 0;
        int count = 0;
        while(pq.size() > 0)
        {
            int tree = pq.poll();
            int pos = map.get(tree);
            int nexti = pos/n;
            int nextj = pos%n;
            
            int step = BFS(board, m, n, tmpi, tmpj, nexti, nextj);
            System.out.println(step);
            if(step == -1) return -1;
            count += step;
            tmpi = nexti;
            tmpj = nextj;
        }
        return count;
        
        
    }
}
