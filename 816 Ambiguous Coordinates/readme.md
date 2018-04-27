# 816. Ambiguous Coordinates

We had some 2-dimensional coordinates, like "(1, 3)" or "(2, 0.5)".  Then, we removed all commas, decimal points, and spaces, and ended up with the string S.  Return a list of strings representing all possibilities for what our original coordinates could have been.

Our original representation never had extraneous zeroes, so we never started with numbers like "00", "0.0", "0.00", "1.0", "001", "00.01", or any other number that can be represented with less digits.  Also, a decimal point within a number never occurs without at least one digit occuring before it, so we never started with numbers like ".1".

The final answer list can be returned in any order.  Also note that all coordinates in the final answer have exactly one space between them (occurring after the comma.)

### Example 1:
Input: "(123)"

Output: ["(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)"]

### Example 2:
Input: "(00011)"

Output:  ["(0.001, 1)", "(0, 0.011)"]

Explanation: 
0.0, 00, 0001 or 00.01 are not allowed.

### Example 3:

Input: "(0123)"

Output: ["(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"]

### Example 4:
Input: "(100)"

Output: [(10, 0)]

Explanation: 
1.0 is not allowed.
 

### Note:

4 <= S.length <= 12.
S[0] = "(", S[S.length - 1] = ")", and the other elements in S are digits.

## Solution:

For this problem, we should just break up the string and for each substring, find the suitable position to insert the '.'. The only thing we should care about is that '0'.


```
    public List<String> helper(String s)
    {
        List<String> list = new ArrayList<String>();
        if(s.length() == 1) list.add(s);
        else if(s.charAt(0) == '0' && s.charAt(s.length()-1) == '0');
        else if(s.charAt(s.length() - 1) == '0')    list.add(s);     
        else if(s.charAt(0) == '0') list.add(s.substring(0, 1) + "." + s.substring(1));
        else
        {
            list.add(s);
            for(int i = 1; i < s.length(); i++)
            {
                list.add(s.substring(0, i) + "." + s.substring(i));
            }
        }
        return list;
    }
    
    public List<String> ambiguousCoordinates(String S)
    {
        List<String> res = new ArrayList<String>();
        for(int i = 2; i < S.length() - 1; i++)
        {
            String s1 = S.substring(1, i);
            List<String> list1 = helper(s1);
            String s2 = S.substring(i, S.length()-1);
            List<String> list2 = helper(s2);
            for(String c1:list1)
            {
                for(String c2:list2)
                {
                    res.add("("+c1+", "+c2+")");
                }
            }
        }
        return res;
    }
```