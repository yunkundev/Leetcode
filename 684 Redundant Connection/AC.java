class Solution 
{
    public int[] parents;
    public int root(int i)
    {
        while(parents[i] != i)
            i = parents[i];
        return i;
    }
    
    public int[] findRedundantConnection(int[][] edges) 
    {
        parents = new int[edges.length+1];
        for(int i = 1; i <= edges.length; i++)
        {
            parents[i] = i;
        }
        for(int[] edge:edges)
        {
            int root1 = root(edge[0]);
            int root2 = root(edge[1]);
            if(root1 == root2) return edge;
            parents[root1] = root2;
        }
        return edges[edges.length-1];
    }
}