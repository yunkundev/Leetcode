public class Solution
{
	 public int lengthOfLongestSubstring(String s)
	 {
	        // cn : the current number of character we have in
		 	int max = 0;
		 	int lastmv = 0;
		 	int k = 0;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for(int i = 0;i < s.length(); i++)
	        {
	        	Character c = s.charAt(i);
	            if( !map.containsKey(c) )
	            {
	                map.put(c,i);
	            }
	            else
	            {
	                int mv= map.get(c);

	                for(int j = lastmv; j <= mv; j++)
	                {
	                    map.remove(s.charAt(j));
	                }
	                map.put(c, i);
	                k = map.size();
	                if(k > max) max = k;
	                lastmv = mv+1;
	            }
	            k = map.size();
	            if(k > max) max = k;

	        }
	        return max;

	 }
}
