class Solution
{
    public List<Integer> cheapestJump(int[] A, int B) 
    {
        int n = A.length;
        int[] dp = new int[n];
        int[] index = new int[n];
        dp[n-1] = 0;
        for(int i = n-2; i >= 0; i--)
        {
            int min = Integer.MAX_VALUE;
            dp[i] = -1;
            for(int j = i+1; j < n && j <= i+B; j++)
            {
                if(A[j] == -1 || dp[j] == -1)
                {
                    continue;
                }
                if(dp[j] < min)
                {
                    min = dp[j];
                    index[i] = j;
                }
            }
            if(min == Integer.MAX_VALUE) dp[i] = -1;
            else dp[i] = min + A[i];
        }
        
        // for(int i = 0; i < n; i++) System.out.print(dp[i] + " ");
        // System.out.println();
        // for(int i = 0; i < n; i++) System.out.print(index[i] +" ");
        List<Integer> res = new ArrayList<Integer>();
        if(dp[0] < 0) return res;
        int tmp = 0;
        while(tmp < n -1 )
        {
            res.add(tmp+1);
            tmp = index[tmp];
            
        }
        res.add(tmp+1);
        return res;
    }
}