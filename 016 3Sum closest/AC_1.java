public class Solution
{

    public List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(n<3) return res;
        for(int i = 0; i < nums.length; i++)
        {
            int str = i + 1, end = n - 1;
            int target = -nums[i];
            if(nums[i]>0) break;
            if( i > 0 && nums[i] == nums[i-1]) continue;

            for(int j = i + 1; j < n; j++)
            {
                if(str >= end)
                {
                    break;
                }
                //Find suitable str and end
                if(nums[str] + nums[end] == target)
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
                        l.add(nums[i]);
                        l.add(nums[str]);
                        l.add(nums[end]);
                        res.add(l);
                    }



                    str++;
                    end--;
                }

                // the sum of two number is less than target, we need a bigger number at left side
                else if(nums[str] + nums[end] < target)
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
        return res;


    }
}
