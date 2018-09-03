/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/
class Solution 
{
    public Node helper(int[][] grid, int row1, int row2, int col1, int col2)
    {
        if(row1 == row2 && col1 == col2) return new Node(grid[row1][col1]==1?true:false, true, null, null, null, null);
        int flag = grid[row1][col1];
        boolean isLeaf = true;
        for(int i = row1; i <= row2; i++)
        {
            for(int j = col1; j <= col2; j++)
            {
                if(grid[i][j] != flag)
                {
                    isLeaf = false;
                    break;
                }
            }
        }
        if(isLeaf) return new Node(flag==1?true:false, true, null, null, null, null);
        int rowm = (row1+row2)/2;
        int colm = (col1+col2)/2;
        
        Node topLeft = helper(grid, row1, rowm, col1, colm);
        Node topRight = helper(grid, row1, rowm, colm+1, col2);
        Node bottomLeft = helper(grid, rowm+1, row2, col1, colm);
        Node bottomRight = helper(grid, rowm+1, row2, colm+1, col2);
        
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
        
    }
    
    
    public Node construct(int[][] grid) 
    {
        int n = grid.length;
        if(n == 0) return null;
        return helper(grid, 0, n-1, 0, n-1);
    }
}