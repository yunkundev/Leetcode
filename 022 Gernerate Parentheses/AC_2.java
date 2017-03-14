public class Solution
{
    public void dfs(int r, int l, String s, ArrayList<String> res)
    {
        if(r == 0 && l == 0)
        {
            res.add(s);
            return;
        }
        if( r > 0 ) dfs(r - 1, l, s.concat("("), res );
        if( l > 0 && l > r ) dfs(r, l - 1, s.concat( ")"), res);
    }
    public List<String> generateParenthesis(int n)
    {
        ArrayList<String> res = new ArrayList<String>();
        dfs(n, n, "", res);
        return res;
    }
}
