class Solution 
{
    public boolean isPossible(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i])+1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int e:map.keySet())
        {
            list.add(e);
        }
        Collections.sort(list);
        int tmp = 0;
        int prev = 0;
        for(int i= 0; i < list.size(); i++)
        {
            int num = list.get(i);
            if(num != prev + 1) 
            {
                tmp = 0;
            }
            if(map.get(num) > tmp)
            {
                int diff = map.get(num) - tmp;
                if(!map.containsKey(num+1) || map.get(num+1) < diff) return false;
                else if(!map.containsKey(num+2) || map.get(num+2) < diff) return false;
                else if(map.containsKey(num+1) && map.containsKey(num+2) && map.get(num+2) < map.get(num+1)-tmp ) return false;
            }
            
            
            tmp = map.get(num);
            prev = num;
        }
        return true;
        
        
    }
}