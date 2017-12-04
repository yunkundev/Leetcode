class Solution 
{
    public int pathSum(int[] nums) 
    {
        if(nums.length  == 0) return 0;
        int[][] rec = new int[6][9];
        rec[1][1] = nums[0]%10;
        int res = 0;
        for(int i= 1; i <= 5; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j]/100 == i)
                {
                    //System.out.println(nums[j]);
                    int ri = (nums[j]/10)%10;
                    //System.out.println(ri);
                    int count = 0;
                    for(int k = 0; k < nums.length; k++)
                    {
                        if(nums[k]/100 == i+1)
                        {
                            int ui = (nums[k]/10)%10;
                            if(ui == ri*2 || ui ==ri*2 -1)
                            {
                                count ++;
                                rec[i+1][ui] = nums[k]%10 + rec[i][ri];
                            }
                        }
                    }
                    if(count == 0) res += rec[i][ri];
                }
            }
        }
        // for(int i = 0; i < 6; i++)
        // {
        //     for(int j = 0; j < 9; j++) System.out.print(rec[i][j] +" ");
        //     System.out.println();
        // }
        return res;
    }
}