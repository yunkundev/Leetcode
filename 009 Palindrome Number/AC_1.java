public class Solution
{
    public boolean isPalindrome(int x)
    {
        if(x < 0 ) return false;
        int d = 1;
        while( x/d >= 10 ) d *= 10;
        int c = 1;
        while(true)
        {
            if((x/d)%10 == (x/c)%10)
            {
                if( c >= d ) break;
                else
                {
                    d /= 10;
                    c *= 10;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
