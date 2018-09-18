class Solution
{
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) 
    {
        if(buckets <= 1) return 0;
        int n = minutesToTest/minutesToDie + 1;
        int x = 1;
        while(true)
        {
            if(Math.pow(n, x) >= buckets)
            {
                return x;
            }
            x++;
        }
    }
}