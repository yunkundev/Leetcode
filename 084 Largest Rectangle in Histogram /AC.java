ass Solution 
{
    public int largestRectangleArea(int[] heights) 
    {
        if(heights.length == 0) return 0;
        if(heights.length == 1) return heights[0];
        Stack<Integer> stack = new Stack<Integer>();
        int height = 0, area = 0, max = 0;
        for(int i = 0; i <= heights.length; i++)
        {
            
            if(stack.empty())
            {
                stack.push(i);
                
            }
            else
            {    
                int pos = stack.peek();
                if( i < heights.length && heights[pos] <= heights[i] )
                {
                    stack.push(i);
                    
                }
                else
                {
                    int len = 0, tmp = 0;
                    if( i != heights.length) len = heights[i];
                    while( !stack.empty() && heights[stack.peek()] > len )
                    {
                        tmp = stack.pop();  
                        if(stack.empty()) area = heights[tmp]*i;
                        else area = heights[tmp]*(i - 1 - stack.peek());
                        if(area > max) max = area;
                    }
                    
                    
                    
                    stack.push(i);
                    
                    
                }
            }
            
        }
        
        
        return max;
    }
}
