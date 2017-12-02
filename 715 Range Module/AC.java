class RangeModule 
{
    List<int[]> ranges;
    public RangeModule() 
    { 
        ranges = new ArrayList<int[]>();
        
        
    }
    
    public boolean cover(int[] r1, int[] r2)
    {
        if(r2[0] > r1[1]) return false;
        if(r2[1] < r1[0]) return false;
        return true;
    }
    
     public boolean cover2(int[] r1, int[] r2)
    {
        if(r2[0] > r1[1]) return false;
        if(r2[1] < r1[0]) return false;
        return true;
    }
    
    public void addRange(int left, int right)
    {
        int[] r = {left, right};
        //System.out.println("AddRange  " + left + " "+ right);
        for(int i = 0; i < ranges.size(); i++)
        {
            if(cover(r, ranges.get(i)))
            {
                left = Math.min(r[0], ranges.get(i)[0]);
                right = Math.max(r[1], ranges.get(i)[1]);
                ranges.remove(i);
                addRange(left, right);
                return;
            }
        }
        ranges.add(r);
        //for(int[] rp:ranges) System.out.println(rp[0]+" "+rp[1]);
        
    }
    
    public boolean queryRange(int left, int right) 
    {
        
        int[] r = {left, right};
        //System.out.println("QueryRange  " + left + " "+ right );
        for(int i = 0; i < ranges.size(); i ++)
        {
            //System.out.println(ranges.get(i)[0] + " "+ranges.get(i)[1]);
            
            if(cover2(r, ranges.get(i)))
            {
                if(left >= ranges.get(i)[0] && right <= ranges.get(i)[1])
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void removeRange(int left, int right) 
    {
        int[] r = {left, right};
        //System.out.println("RemoveRange  " + left + " "+ right);
        for(int i = 0; i < ranges.size(); i++)
        {
            if(cover2(r, ranges.get(i)))
            {
                if(left <= ranges.get(i)[0] && right >= ranges.get(i)[1])
                {
                    ranges.remove(i);
                    i--;
                }
                else if(left >= ranges.get(i)[0] && right <= ranges.get(i)[1])
                {
                    int ll = ranges.get(i)[0];
                    int rr = ranges.get(i)[1];
                    ranges.remove(i);
                    int[] rangel = {ll, left};
                    int[] ranger = {right, rr};
                    ranges.add(rangel);
                    ranges.add(ranger);   
                    break;
                }
                else if(right > ranges.get(i)[0] && right < ranges.get(i)[1])
                {
                    ranges.get(i)[0] = right;
                }
                else if(left < ranges.get(i)[1] && left > ranges.get(i)[0])
                {
                    ranges.get(i)[1] = left;
                    
                }
            }
        }
        //for(int[] rp:ranges) System.out.println(rp[0]+" "+rp[1]);

    }
}