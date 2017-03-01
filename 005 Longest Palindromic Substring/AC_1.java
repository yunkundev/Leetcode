public class Solution
{
    public String longestPalindrome(String s)
    {
        String subs = new String("");
        int j, len=0, max=0;
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            int k = (i+n/2-1)%n;
            for(j = 1; j < n; j++)
            {
                if((k - j < 0) ||(k + j >= n)) break;
                if(s.charAt(k-j) != s.charAt(k+j)) break;
            }
            j--;
            len = 2 * j + 1;
            if(len > max)
            {
                max = len;
                subs = s.substring(k-j, k+j+1);
                if(max == n) return subs;
            }
        }
        for(int i = 0; i< n-1; i++)
        {
            int k = (i+n/2-1)%(n-1);
            if(s.charAt(k) != s.charAt(k+1)) continue;
            for(j = 1 ; j < n; j++)
            {
                if((k - j) < 0||(k + 1 + j) >= n) break;
                if((s.charAt(k-j) != s.charAt(k+1+j) )) break;
            }
            j--;
            len = 2*j +2;
            if(len > max)
            {
                max = len;
                subs = s.substring(k-j, k+j+2);
                if(max == n) return subs;
            }
        }

        return subs;
    }
}
