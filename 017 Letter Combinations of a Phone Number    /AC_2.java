public class Solution
{
    public static String[] alp = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void dfs(List<String> strs, String digits, String s)
    {
        if(digits.length()==0)
        {
            strs.add(s);
            return;
        }
        else
        {
            int d = digits.charAt(0) - '0';
            String chars = alp[d];
            digits = digits.substring(1);
            for(int i = 0; i < chars.length(); i++)
            {
                dfs(strs, digits, s+ chars.charAt(i) );
            }
        }
    }


    public List<String> letterCombinations(String digits)
    {
        List<String> strs = new ArrayList<String>();
        if(digits.length()==0) return strs;
        else
        {
            dfs(strs, digits, "");
        }


        return strs;

    }
}
