# 241. Different Ways to Add Parentheses

Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. The valid operators are +, - and *.

### Solution:

The problem of this question is most about the order of operation. We should consider this question from the top to bottom instead of bottom to top to avoid the repeat of (a*b) - (a*b). We can just assume the first operation is - between two (a*b). 