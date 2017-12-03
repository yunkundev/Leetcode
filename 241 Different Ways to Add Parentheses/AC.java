class Solution
{

    public List<Integer> diffWaysToCompute(String input) 
    {
        
        List<Integer> list = new ArrayList<Integer>();
        int start = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*')
            {
                List<Integer> num1 = diffWaysToCompute(input.substring(0, i)); 
                List<Integer> num2 = diffWaysToCompute(input.substring(i+1)); 
                for(int n1:num1)
                {
                    for(int n2:num2)
                    {
                        if(input.charAt(i) == '+')
                        {
                            list.add(n1+n2);
                        }
                        if(input.charAt(i) == '*')
                        {
                            list.add(n1*n2);
                        }
                        if(input.charAt(i) == '-')
                        {
                            list.add(n1-n2);
                        }
                    }
                }
            }
        }
        if(list.size() == 0) list.add(Integer.parseInt(input));
        return list;
    }
}