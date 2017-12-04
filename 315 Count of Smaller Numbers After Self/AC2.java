class Solution 
{
    static class record
    {
        int index;
        int num;
        int count;
        record(int i, int n, int c)
        {
            index = i;
            num = n;
            count = c;
        }
    }
    
    
    
    public void mergeSort(record[] rs, int start, int end)
    {
        if(start >= end) return;

        int mid = (start + end)/2;
        mergeSort(rs, start, mid);
        
        mergeSort(rs, mid+1, end);
        
    
        int indexl = start;
        int indexr = mid+1;
        int index = 0;
        int count = 0;
        record[] res = new record[end-start+1];
        while(indexl <= mid && indexr <= end)
        {
            //System.out.println(rs[indexr].num + " "+rs[indexl].num+" "+count);
            if(rs[indexr].num < rs[indexl].num)
            {
                count++;
                res[index++] = rs[indexr++];
            }
            else
            {
                rs[indexl].count += count;
                res[index++] = rs[indexl++];
            }
        }
        //System.out.println(count);
        while(indexl <= mid || indexr <= end)
        {
            if(indexr <= end){res[index++] = rs[indexr++];}
            else if(indexl <= mid){rs[indexl].count += count; res[index++] = rs[indexl++];}
        }
        for(int i = 0; i < res.length; i++)
        {
            rs[start+i] = res[i];
        }
        
        // for(record r:rs)
        // {
        //     System.out.print(r.num+ "/" +r.count+"   ");
        // }System.out.println();
    }
    
    public List<Integer> countSmaller(int[] nums) 
    {
        int n = nums.length;
        record[] rs = new record[n];
        for(int i = 0; i < n; i++)
        {
            rs[i] = new record(i, nums[i], 0); 
        }
        mergeSort(rs, 0 ,n-1);
        
        Arrays.sort(rs, new Comparator<record>(){
            public int compare(record a, record b)
            {
                return a.index- b.index;
            }
        });
        List<Integer> res = new ArrayList<Integer>();
        for(record r:rs)
        {
            res.add(r.count);
        }
        return res;
    }
}