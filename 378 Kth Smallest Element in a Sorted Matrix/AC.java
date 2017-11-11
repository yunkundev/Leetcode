class Solution 
{
    public int kthSmallest(int[][] matrix, int k) 
    {
        int n = matrix.length;
        if(n == 0) return -1;
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(n*n, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b)
            {
                return a[0] - b[0];
            }
        });
        pq.offer(new int[]{matrix[0][0], 0, 0});
        int index = 1;
        while(index < k)
        {
            int[] tmp = pq.poll();
            int i = tmp[1];
            int j = tmp[2];
            //System.out.println(i + " " +j);
            if(j < n-1 && !visited[i][j+1]) 
            {
                pq.offer(new int[]{matrix[i][j+1],i,j+1});
                visited[i][j+1] = true;
            }
            if(i < n-1 && !visited[i+1][j]) 
            {
                pq.offer(new int[]{matrix[i+1][j],i+1,j});
                visited[i+1][j] = true;
            }
            index ++;
        }
        int[] res = pq.poll();
        return res[0];
        
    }
}