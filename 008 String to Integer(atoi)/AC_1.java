public class Solution
{
    public int myAtoi(String str)
    {
        if(str.length() == 0) return 0;
        int sign = 1;
        long sum = 0;
        int flag = 0;
        int ex = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if( str.charAt(i) == ' ' && ex == 0)
            {
                continue;
            }
            else if( str.charAt(i) == ' ' && ex != 0)
            {
                break;
            }
            else if( str.charAt(i) == '-' && flag == 0)
            {
                sign = -1;
                flag = 1;
                ex = 1;
                continue;
            }
            else if( str.charAt(i) == '+' && flag ==0 )
            {
                flag = 1;
                ex = 1;
                continue;
            }
            else if(  str.charAt(i) > '9' || str.charAt(i)<'0' )
            {
                break;
            }
            else if(ex < 12)
            {
                sum = sum*10 + (str.charAt(i)-'0');
                ex++;

            }

        }
        sum = sign*sum;
        if(sum > 2147483647) sum = 2147483647;
        if(sum < -2147483648) sum = -2147483648;
        return Math.toIntExact(sum);
    }
}
