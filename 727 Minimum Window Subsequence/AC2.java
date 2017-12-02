class Solution 
{
    public String minWindow(String S, String T) 
    {
        int slen = S.length();
        int tlen = T.length();
        int[][] dp = new int[tlen][slen];
        dp[0][0] = S.charAt(0) == T.charAt(0)?1:Integer.MAX_VALUE;
        for(int j = 1; j < slen; j++)
        { 
            if(S.charAt(j) == T.charAt(0))  dp[0][j] = 1;
            else if(dp[0][j-1] == Integer.MAX_VALUE)    dp[0][j] = dp[0][j-1];
            else    dp[0][j] = dp[0][j-1] + 1;
        }
        
        for(int i = 1; i < tlen; i++)
        {
            for(int j = 0; j < slen; j++)
            { 
                if(S.charAt(j) == T.charAt(i) )
                {
                    if(j == 0||dp[i-1][j-1] == Integer.MAX_VALUE) dp[i][j] = Integer.MAX_VALUE;
                    else dp[i][j] = dp[i-1][j-1] + 1;   
                }
                else
                {
                    if(j == 0||dp[i][j-1] == Integer.MAX_VALUE)  dp[i][j] = Integer.MAX_VALUE;
                    else dp[i][j] = dp[i][j-1]+1;
                }
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
        else return S.substring(min-res_min+1, min+1);
    }
}