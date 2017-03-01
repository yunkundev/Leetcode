public class Solution 
{
	 public int lengthOfLongestSubstring(String s) 
	 {
	        // we use st flag to tag the character arr
		 	int max = 0;
		 	int st = 0;
		 	int k = 0;
	        int[] last = new int[256];
	        for(int i = 0; i <  256; i++)
	        {
	            last[i] = -1;
	        }
	        for(int i = 0; i < s.length(); i++)
	        {
	        	int c = (int)s.charAt(i);
	            if( last[c] >= st  )
	            {
	                if(i - st > max)  max = i - st;
	                st = last[c] + 1;
	            }
	            last[c] = i;
	        }
	        if(s.length() - st > max) max = s.length() - st;
	        return max;
	        
	 }
}
