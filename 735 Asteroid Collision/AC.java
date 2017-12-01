class Solution 
{
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < asteroids.length; i++)
        {
            
            while(true)
            {
                if(!stack.empty() && stack.peek() > 0 && asteroids[i] < 0)
                {

                    if(stack.peek() == -asteroids[i]) 
                    {
                        stack.pop();
                        break;
                    }
                    else if(stack.peek() < -asteroids[i]) 
                    {
                        stack.pop();
                        continue;
                    }
                    else
                    {
                        break;
                    }
                }
                else 
                {
                    stack.push(asteroids[i]);
                    break;
                }
            }
            
        }
        int[] res = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--)
        {
            res[i] = stack.pop();
        }
        return res;
    }
}