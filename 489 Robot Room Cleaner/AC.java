/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */
class Solution
{
    public void dfs(Robot rob, int x, int y, int dir, HashSet<String> visited)
    {
        int[][] neighb = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        String pos = x+" "+y;
        System.out.println(pos);
        rob.clean();
        visited.add(pos);
        
        for(int i = 0; i < 4; i++)
        {
            int t = (dir+i)%4;
            int next_x = x + neighb[t][0];
            int next_y = y + neighb[t][1];
            String next_str = next_x + " " + next_y;
            if( !visited.contains(next_str) && rob.move() )
            {
                dfs(rob, next_x, next_y, t, visited);
                rob.turnLeft();
                rob.turnLeft();
                rob.move();
                rob.turnRight();
                rob.turnRight();
            }
            rob.turnRight();
            
        }
        
    }
    
    
    
    
    
    public void cleanRoom(Robot robot) 
    {
        HashSet<String> visited = new HashSet<String>();   
        dfs(robot, 0, 0, 0, visited);
    }
}