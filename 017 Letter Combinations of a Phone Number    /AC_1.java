public class Solution
{
    public List<String> addDigits(List<String> strs, int d)
    {
       List<String> res = new ArrayList<String>();
       for(String s:strs)
       {
           if(d == 0)
           {
               res.add(s+" ");
           }
           if(d > 1 && d <= 6)
           {

                   char c1 = (char)('a'+(d-2)*3);
                   char c2 = (char)('a'+(d-2)*3 + 1);
                   char c3 = (char)('a'+(d-2)*3 + 2);
                   res.add(s+c1);
                   res.add(s+c2);
                   res.add(s+c3);


           }
           if(d == 7)
           {
               res.add(s+"p");
               res.add(s+"q");
               res.add(s+"r");
               res.add(s+"s");
           }
           if(d == 8)
           {
               res.add(s+"t");
               res.add(s+"u");
               res.add(s+"v");
           }
           if(d == 9)
           {
               res.add(s+"w");
               res.add(s+"x");
               res.add(s+"y");
               res.add(s+"z");
           }

       }
       return res;

    }


    public List<String> letterCombinations(String digits)
    {
        List<String> strs = new ArrayList<String>();
        if(digits.length() == 0) return strs;
        else strs.add("");
        for(int i = 0; i < digits.length(); i++)
        {
            int d = digits.charAt(i) - '0';
            strs = addDigits(strs,d);
        }
        return strs;

    }
}
