public class Solution
{
    public int divide(int dividend, int divisor)
    {
        int op = 1;

        if(divisor == 0)
        {
            return Integer.MAX_VALUE;
        }

        long l1 = dividend, l2 = divisor;
        if(dividend < 0)
        {
            l1 = -l1;
            op = -op;
        }
        if(divisor < 0)
        {
            l2 = -l2;
            op = -op;
        }

        long ans = 0;
        if( l1 < l2)
        {
            ans = 0;
        }
        else
        {
            String s1 = Long.toString(l1);
            int len1 = s1.length();
            String s2 = Long.toString(l2);
            int len2 = s2.length();


            long tmp = Long.parseLong( s1.substring(0,len2));
            for(int i = len2-1; i < len1; i++)
            {
                if( i >= len2)
                {
                    tmp = tmp*10 + s1.charAt(i) - '0';
                }

                ans *= 10;
                while(tmp >= l2)
                {
                    tmp -= l2;
                    ans ++;
                }
                //System.out.println(ans);
            }
        }
        ans = op*ans;
        //System.out.println(ans);
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return (int)ans;
        }



    }
}
