class MyCalendarThree
{
    TreeMap<Integer, Integer> map;
    List<Integer> list;
    public MyCalendarThree() 
    {
        map = new TreeMap<Integer, Integer>();
        list = new ArrayList<Integer>();
    }
    
    public int book(int start, int end) 
    {
        if(map.containsKey(start)) map.put(start, map.get(start)+1);
        else 
        {
            map.put(start, 1);
        }
        if(map.containsKey(end)) map.put(end, map.get(end)-1);
        else 
        {
            map.put(end, -1);
            
        }
        
        int count = 0;
        int max = 0;
        for(int i:map.values())
        {
            count += i;
            max = Math.max(max, count);
        }
        return max;
    }
}