class Solution 
{
    public boolean verify(int[] preorder, int start, int end)
    {
        //System.out.println(preorder[start] +" "+ preorder[end]);
        if(start >= end) return true;
        int val = preorder[start];
        boolean split = false;
        int index = 0;
        for(int i = start+1; i <= end; i++)
        {
            if(!split && preorder[i] > val)
            {
                split = true;
                index = i;
            }
            else if(split && preorder[i] < val) return false;
        }
        if(index != 0)
        {
            if(!verify(preorder, index, end)) return false;
            if(!verify(preorder, start+1, index-1)) return false;
        }
        else
        {
            if(!verify(preorder, start+1, end)) return false;
        }
        
        
        return true;
    }
    
    public boolean verifyPreorder(int[] preorder) 
    {
        return verify(preorder, 0, preorder.length-1);
        
    }
}