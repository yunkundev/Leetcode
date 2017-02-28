public class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] sol = new int[2];

    	int[] copy = new int[nums.length];
    	for(int i = 0; i < nums.length; i++)
    	{
    	    copy[i] = nums[i];
    	}
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length; i++)
    	{
    	     //Find targe-num[i] in the array after i
    		 if(BSearch(target-nums[i],i+1,nums.length-1,nums))
    		 {
    			 sol = FindPostion(nums[i],target-nums[i],copy);
    			 break;
    		 }
    	}
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

    //Binary Search
	private Boolean BSearch(int t, int str, int end, int[] a)
	{
		if(str > end)
		{
		    return false;
		}
		int mid = (str+end)/2;
		if(a[mid] == t)
		{
			return true;
		}
		else if(a[mid] > t)
		{
			return BSearch(t,str,mid-1,a);
		}
		else
		{
			return BSearch(t,mid+1,end,a);
		}				
	}
}
