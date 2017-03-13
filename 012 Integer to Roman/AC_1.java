public class Solution
{
    public String intToRoman(int num)
    {
        int t = num/1000;
        num = num%1000;
        int h = num/100;
        num = num%100;
        int n = num/10;
        int o = num%10;

        String s = "";
        for(int i = 0; i < t; i++ )
        {
            s += "M";
        }
        if(h == 9 )
        {
            s += "CM";
        }
        else if(h == 4)
        {
            s += "CD";
        }
        else
        {
            if(h >= 5)
            {
                s += "D";
                h -= 5;
            }
            for(int i = 0; i< h; i++)
            {
                s += "C";
            }
        }



        if(n == 9 )
        {
            s += "XC";
        }
        else if(n == 4)
        {
            s += "XL";
        }
        else
        {
            if(n >= 5)
            {
                s += "L";
                n -= 5;
            }
            for(int i = 0; i< n; i++)
            {
                s += "X";
            }
        }


        if(o == 9 )
        {
            s += "IX";
        }
        else if(o == 4)
        {
            s += "IV";
        }
        else
        {
            if(o >= 5)
            {
                s += "V";
                o -= 5;
            }
            for(int i = 0; i< o; i++)
            {
                s += "I";
            }
        }
        return s;
    }
}
