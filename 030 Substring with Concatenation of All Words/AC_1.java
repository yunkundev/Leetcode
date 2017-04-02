public class Solution
{
    public List<Integer> findSubstring(String s, String[] words)
    {
        int wlen = words[0].length();
        int slen = s.length();
        int n = 0, count = 0;

        ArrayList<String> check = new ArrayList<String>();
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i = 0; i < words.length; i++)
        {

            check.add(words[i]);
        }
        for(int i = 0; i < wlen; i++)
        {
            al = new ArrayList<String>();
            for(int k = 0; k < words.length; k++)
            {
                al.add(words[k]);
            }

            n = (slen - i)/wlen;
            String[] split = new String[n];
            for(int j = 0; j < n; j++)
            {
                split[j] = s.substring(i+j*wlen,i+j*wlen+wlen);
            }

            int start = 0;
            for(int end = 0;end < n; end++)
            {
                if(al.contains(split[end]))
                {
                    al.remove(split[end]);
                    if(al.isEmpty())
                    {
                        ans.add(i+start*wlen);
                        al.add(split[start]);
                        start ++;
                    }
                }
                else
                {
                    if(check.contains(split[end]))
                    {
                        while(start < end)
                        {

                            if(split[start].equals(split[end]))
                            {
                                start++;
                                break;
                            }
                            else
                            {

                                al.add(split[start]);
                                start++;
                            }
                        }
                    }
                    else
                    {
                        start = end +1;
                        al = new ArrayList<String>();
                        for(int k = 0; k < words.length; k++)
                        {
                            al.add(words[k]);
                        }
                    }
                }


            }

        }
        return ans;
    }
}
