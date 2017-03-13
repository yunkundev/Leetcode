public class Solution
{
    public boolean isValid(String s)
    {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int i = 0; i < s.length();i++ )
        {
            char a = s.charAt(i);
            if(a == '(' )
            {
                stack.push(1);
            }
            if(a == ')' )
            {
                if(stack.size()==0||stack.pop() != 1)
                {
                    return false;
                }
            }
            if(a == '[')
            {
                stack.push(2);
            }
            if(a ==  ']')
            {
                if(stack.size()==0||stack.pop() != 2)
                {
                    return false;
                }
            }
            if(a == '{')
            {
                stack.push(3);

            }
            if(a == '}')
            {
                if(stack.size()==0||stack.pop() != 3)
                {
                    return false;
                }
            }
        }
        if(stack.size()==0)
            return true;
        else return false;


    }
}
