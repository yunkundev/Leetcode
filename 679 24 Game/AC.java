class Solution 
{
    
    
    
    public boolean helper(double[] nums)
    {
        // for(int i = 0; i < nums.length; i++) System.out.print(nums[i] + " ");
        // System.out.println();
        int n = nums.length;
        if(n == 2)
        {
            if(Math.abs(nums[0] + nums[1] - 24) < 0.000001) return true;
            if(nums[1] != 0 && Math.abs(nums[0] / nums[1] - 24) < 0.000001) return true;
            if(nums[0] != 0 && Math.abs(nums[1] / nums[0] - 24) < 0.000001 ) return true;
            if(Math.abs(nums[0] - nums[1] - 24) < 0.000001) return true;
            if(Math.abs(nums[1] - nums[0] - 24) < 0.000001) return true;
            if(Math.abs(nums[0] * nums[1] - 24) < 0.000001) return true;
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == j) continue;
                double[] nums_new = new double[n-1];
                int index = 0;
                for(int k = 0; k < n; k++)
                {
                    if( k != i && k != j)
                    {
                        nums_new[index++] = nums[k];
                    }
                }
                nums_new[index] = nums[i] + nums[j];
                if(helper(nums_new)) return true; 
                nums_new[index] = nums[i] * nums[j];
                if(helper(nums_new)) return true; 
                if(nums[j] != 0) 
                {
                    nums_new[index] = nums[i] / nums[j];
                    if(helper(nums_new)) return true;   
                }
                if(nums[i] != 0) 
                {
                    nums_new[index] = nums[j] / nums[i];
                    if(helper(nums_new)) return true;   
                }
                nums_new[index] = nums[i] - nums[j];
                if(helper(nums_new)) return true; 
                nums_new[index] = nums[j] - nums[i];
                if(helper(nums_new)) return true; 
            }
        }
        return false;
    }
    
    public boolean judgePoint24(int[] nums) 
    {

        
        double[] p = new double[nums.length];
        
        for(int i  = 0; i < nums.length; i++)
        {
            p[i] = (double)nums[i];
        }
        return helper(p);
    }
}