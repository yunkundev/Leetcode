public class Solution
{
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(n<4) return res;
        for(int k = 0; k < nums.length; k++)
        {
            int t1 = target - nums[k];
            if(nums[k] > target&& nums[k]>0) break;
            if( k > 0 && nums[k] == nums[k-1]) continue;
            for(int i = k + 1; i < nums.length; i++)
            {
                int str = i + 1, end = n - 1;
                int t2 = t1 - nums[i];
                if(nums[k] + nums[i] > target && nums[i]>0 ) break;
                if( i > k+1 && nums[i] == nums[i-1]) continue;

                for(int j = i + 1; j < n; j++)
                {
                    if(str >= end)
                    {
                        break;
                    }
                    //Find suitable str and end
                    if(nums[str] + nums[end] == t2)
                    {
                        if(str-1 > i && nums[str] == nums[str-1] )
                        {
                            str++;
                            continue;
                        }
                        else if(end+1 < n && nums[end] == nums[end+1])
                        {
                            end--;
                            continue;
                        }
                        else
                        {
                            List<Integer> l = new ArrayList<Integer>();
                            l.add(nums[k]);
                            l.add(nums[i]);
                            l.add(nums[str]);
                            l.add(nums[end]);
                            res.add(l);
                        }



                        str++;
                        end--;
                    }

                    // the sum of two number is less than target, we need a bigger number at left side
                    else if(nums[str] + nums[end] < t2)
                    {
                        str++;
                    }
                    // the sum of two number is bigger than target, we need a less number at right side
                    else
                    {
                        end--;
                    }

                }

            }


        }
        return res;
    }
}
