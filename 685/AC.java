class Solution 
{
    public int[] findRedundantDirectedConnection(int[][] edges) 
    {
        int n = edges.length;
        int t1 = 0, t2 = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean loop = true;
        for(int i = 0; i < n; i++)   
        {
            if(!map.containsKey(edges[i][1])) map.put(edges[i][1],i);
            else 
            {
                loop = false;
                t1 = map.get(edges[i][1]);
                t2 = i;
                break;
            }
        }
        
        
        if(loop) 
        {
            int[] uf = new int[n+1];
            for(int i = 1; i <= n; i++)
            {
                uf[i] = i;
            }
            for(int i = 0; i < n; i++)
            {
                int[] tmp = edges[i];
                int f = tmp[0];
                int a = tmp[1];
                if(uf[a] == uf[f]) return edges[i];
                int p = uf[a];
                for(int j = 1; j <= n; j++)
                {
                    if(uf[j] == p)
                    {
                        uf[j] = uf[f];
                    }
                }
                        
            }
        }
        
        //System.out.println(t1 + " "+t2);
        int[] uf = new int[n+1];
        for(int i = 1; i <= n; i++)
        {
            uf[i] = i;
        }
        
        
        for(int i = 0; i < n; i++)
        {
            if(i == t2) continue;
            int[] tmp = edges[i];
            int f = tmp[0];
            int a = tmp[1];
            if(uf[a] == uf[f]) return edges[t1];
            int p = uf[a];
            for(int j = 1; j <= n; j++)
            {
                if(uf[j] == p)
                {
                    uf[j] = uf[f];
                }
            }
                        
        }
        int p = uf[1];
        for(int i =1; i <= n; i++)
        {
            if(uf[i] != p) return edges[t1];
        }
        
        return edges[t2];
    }
}