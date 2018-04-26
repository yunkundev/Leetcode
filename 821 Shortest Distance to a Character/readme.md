# 821. Shortest Distance to a Character

Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

### Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

### Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.

## Solution:

For all these problem which we should calculate the nearest left part and nearest right part, we should consider the method that traversal from the left to right and from the right to left to calculate the distance 2 times.

```
    public int[] shortestToChar(String S, char C)
    {
        int[] count = new int[S.length()];
        int tmp = S.length();
        for(int i = 0; i < S.length(); i++)
        {
            if(S.charAt(i) == C) tmp = 0;
            else tmp = tmp+1;
            count[i] = tmp;
        }
        for(int i = S.length() - 1; i >= 0; i--)
        {
            if(S.charAt(i) == C) tmp = 0;
            else tmp = tmp+1;
            count[i] = Math.min(count[i], tmp);
        }
        return count;
    }

```