public class Solution
{
     // Sort + pointer
    public int[] twoSum(int[] nums, int target)
    {
        int n = nums.length;
        int[] sol = new int[2];
    	int[] copy = new int[n];
    	for(int i = 0; i < n; i++)
    	{
    	    copy[i] = nums[i];
    	}
    	Arrays.sort(nums);
    	// str: left pointer, end: right pointer
        int str = 0, end = n - 1;
        for(int i = 0; i < n; i++)
        {
            //Find suitable str and end
            if(nums[str] + nums[end] == target)
            {
                break;
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

    	sol = FindPostion(nums[str],nums[end],copy);
		return sol;
    }
    //Find the position in original array
	private int[] FindPostion(int v1, int v2, int[] a)
	{
	    int[] s = new int[2];
	    int k = 0;
		for(int i = 0; i < a.length; i++)
		{
		    if(a[i] == v1|| a[i] == v2)
		    {
		        s[k++] = i;
		    }
		}
		return s;
	}


}
