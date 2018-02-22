class Solution 
{
    public int numWays(int n, int k) 
    {
        if(n == 0||k ==0) return 0;
        int[] same = new int[n];
        int[] diff = new int[n];
        diff[0] = k;
        same[0] = 0;
        for(int i = 1; i < n; i++)
        {
            diff[i] = (same[i-1]+diff[i-1])*(k-1);
            same[i] = diff[i-1];
        }
        return diff[n-1]+same[n-1];
    }
}