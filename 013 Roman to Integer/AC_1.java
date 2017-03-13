public class Solution
{
    //Symbol	I	V	X	L	C	D	M
    //Value	    1	5	10	50	100	500	1,000
    public int romanToInt(String s)
    {
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'M' )
            {
                sum += 1000;
            }
            if(s.charAt(i) == 'D' )
            {
                sum += 500;
            }
            if(s.charAt(i) == 'C' )
            {
                if( i+1 < s.length() && (s.charAt(i+1) == 'D'||s.charAt(i+1) == 'M' )) sum -= 100;
                else sum += 100;

            }
            if(s.charAt(i) == 'L' )
            {
                sum += 50;
            }
            if(s.charAt(i) == 'X')
            {
                if( i+1 < s.length() && (s.charAt(i+1) == 'C'||s.charAt(i+1) == 'L' )) sum -= 10;
                else sum += 10;

            }
            if(s.charAt(i) == 'V')
            {
                sum += 5;
            }
            if(s.charAt(i) == 'I')
            {
                if( i+1 < s.length() && (s.charAt(i+1) == 'X'||s.charAt(i+1) == 'V' )) sum -= 1;
                else sum += 1;
            }
        }

        return sum;
    }
}
