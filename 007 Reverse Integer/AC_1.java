public class Solution
{
    public int reverse(int x)
    {
        if( x == -2147483648) return 0;
        if( x < 0 ) return (-1)*reverse(-x);
        int rem = 0, tmp = x;
        long res = 0;
        while(true)
        {
            rem = tmp % 10;
            res = res * 10 + rem;
            tmp = tmp / 10;
            if(tmp == 0) break;
        }
        if(res <= 0 || res > 2147483647) return 0;
        else return Math.toIntExact(res);
    }
}
