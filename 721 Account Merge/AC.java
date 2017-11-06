class Solution
{
    public List<List<String>> accountsMerge(List<List<String>> accounts)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int len = accounts.size();
        int uf[] = new int[len];
        for(int i = 0; i < accounts.size(); i++)
        {
            uf[i] = i;
            List<String>list = accounts.get(i);
            String hold = list.get(0);
            List<Integer> merged = new ArrayList<Integer>();
            for(int j = 1; j < list.size(); j++)
            {
                
                String em = list.get(j);
                if(map.containsKey(em))
                {
                    if(map.get(em) != i )
                    {
                        int tmp = map.get(em);
                        int val = uf[tmp];
                        for(int k = 0; k < len; k ++)
                        {
                            if(uf[k] == val)
                            {
                                uf[k] = i;
                            }
                        }
                    }
                }
                map.put(em, i);
            }
            
        }
        
        // for(int i = 0; i < len; i++)
        // {
        //     System.out.print( uf[i]+" ");
        // }
        
        List<List<String>> res = new ArrayList<>();
        for(int k = 0; k < len; k ++)
        {
            List<String> list = new ArrayList<String>();
            boolean first = true;
            for(int i = 0; i < len; i++)
            {
                if( uf[i]== k && first)
                {
                    list.addAll(accounts.get(i));
                    first = false;
                }
                else if(uf[i] == k)
                {
                    accounts.get(i).remove(0);
                    list.addAll(accounts.get(i));
                }
            }
            if(!first)
            {
                res.add(list);
            }
        }
        
        
        
        for(List<String> list:res)
        {
            String s = list.remove(0);
            Collections.sort(list);
            list.add(0, s);
        }
        for(List<String> list:res)
        {
            for(int i =1; i < list.size()-1; i++)
            {
                if(list.get(i).equals(list.get(i+1)))
                {
                    list.remove(i);
                    i--;
                }
            }
        }
        
        
        return res;
    }
}
