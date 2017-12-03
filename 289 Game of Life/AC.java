class Solution 
{
    int[][] neighbors = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    public int[] calculate(int[][] board, int i1, int j1)
    {
        int m = board.length;
        int n = board[0].length;
        int[] cal = new int[2];
        for(int i = 0; i < 8; i++)
        {
            int i2 = i1 + neighbors[i][0];
            int j2 = j1 + neighbors[i][1];
            if(i2 >= m || i2 < 0 || j2 >= n || j2 < 0) continue;
            if(board[i2][j2]%2 == 0) cal[1]++;
            else cal[0] ++;
        }
        return cal;
    }
    
    public void gameOfLife(int[][] board) 
    {
        int m = board.length;
        if(m == 0) return;
        int n = board[0].length;
        if(n == 0) return;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int[] cal = calculate(board, i, j);
                int dead = cal[1];
                int live = cal[0];
                if(board[i][j] == 1)
                {
                    if(live == 2|| live == 3)  continue;
                    else board[i][j] = 3;
                }
                else
                {
                    if(live == 3) board[i][j] = 2; 
                }
            }
        }
        
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(board[i][j] == 2) board[i][j] = 1;
                if(board[i][j] == 3) board[i][j] = 0;
            }
        }
        
    }
}