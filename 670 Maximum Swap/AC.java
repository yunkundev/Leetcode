class Solution
{
    public void exchange(char[]ca, int i, int j)
    {
        char tmp = ca[i];
        ca[i] = ca[j];
        ca[j] = tmp;
    }
    public int maximumSwap(int num)
    {
        String numStr = String.valueOf(num);
        char[] ca = numStr.toCharArray();
        for(int i = 0; i < ca.length; i++)
        {
            
            int max = (int)(ca[i] - '0' + 1);
            //System.out.println(i+" " + max);
            int infer = -1;
            for(int j = i + 1; j <ca.length; j++)
            {
                int now = (int)(ca[j] - '0' );
                if(now >= max)
                {
                    infer = j;
                    max = now;
                }
            }
            if(infer > 0)
            {
                //System.out.println(i + " " + infer);
                exchange(ca, i,infer);
                break;
            }
        }
        String s = String.valueOf(ca);
        int res = Integer.valueOf(s);
        return res;
    }
}
