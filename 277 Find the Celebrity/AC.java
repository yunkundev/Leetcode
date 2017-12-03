/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation 
{
    public int visit(int i, int n, boolean[] visited)
    {
        visited[i] = true;
        int count = 0;
        System.out.println(i);
        for(int j = 0; j < n; j++)
        {
            if( i != j && knows(i, j))
            {
                count ++;
                if(!visited[j]) return visit(j, n, visited);
            }
            
        }
        if(count == 0) return i;
        else return -1;
    
    }
    
    public int findCelebrity(int n) 
    {
        boolean[] visited = new boolean[n];
        int c = visit(0, n, visited);
        System.out.println("c: "+c);
        if(c == -1) return -1;
        for(int i = 0; i < n; i++)
        {
            if(i != c && !knows(i, c)) return -1;
        }
        return c;
    }
}