class Solution 
{
    public String minWindow(String S, String T) 
    {
        int slen = S.length();
        int tlen = T.length();
        int[][] dp = new int[tlen][slen];
        for(int j = 0; j < slen; j++)
        { 
            if(S.charAt(j) == T.charAt(0))
            {
                dp[0][j] = 0;
            }
            else
            {
                dp[0][j] = -1;
            } 
        }
        
        for(int i = 1; i < tlen; i++)
        {
            for(int j = 0; j < slen; j++)
            { 
                if(S.charAt(j) != T.charAt(i))
                {
                    dp[i][j] = -1;
                    continue;
                }
                int min = Integer.MAX_VALUE;
                for(int k = j-1; k >= 0; k--)
                {
                    if((j-k) >= min)
                    {
                        break;
                    }
                    if(dp[i-1][k] >= 0)
                    {
                        min = Math.min(min, dp[i-1][k]+(j-k));
                        break;
                    }
                    
                }
                if(min == Integer.MAX_VALUE) dp[i][j] = -1;
                else dp[i][j] = min;
            }
        }
        

        int res_min = Integer.MAX_VALUE;
        int min = 0;
        for(int j = 0; j< slen; j++)
        {
            if(dp[tlen-1][j] >= 0)
            {
                if(dp[tlen-1][j] < res_min)
                {
                    res_min = dp[tlen-1][j];
                    min = j;
                }
               
            }
            
        }
        //System.out.println(res_min + " "+min);
        if(res_min == Integer.MAX_VALUE) return "";
        else return S.substring(min-res_min, min+1);
    }
}