public class Solution
{
    public int strStr(String haystack, String needle)
    {
        if(needle.length() == 0)
        {
            return 0;
        }
        else if(haystack.length() == 0)
        {
            return -1;
        }
        for(int i = 0; i < haystack.length(); i++)
        {
            if(haystack.charAt(i) == needle.charAt(0) )
            {
                int j = 0;
                for(j = 0; j < needle.length(); j++)
                {
                    if( i + j >= haystack.length())
                    {
                        break;
                    }
                    else if(haystack.charAt(i+j) != needle.charAt(j))
                    {
                        break;
                    }
                }
                if(j == needle.length())
                {
                    return i;
                }
            }
            if( i + needle.length() > haystack.length() )
            {
                break;
            }
        }
        return -1;
    }
}
