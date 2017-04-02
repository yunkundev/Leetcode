# 010 Regular Expression Matching

Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

### Examples:

>isMatch("aa","a") → false

>isMatch("aa","aa") → true

>isMatch("aaa","aa") → false

>isMatch("aa", "a*") → true

>isMatch("aa", ".*") → true

>isMatch("ab", ".*") → true

>isMatch("aab", "c*a*b") → true

### Solution

这道题是一道简化的正则表达式问题，我记得正规的正则表达式处理用到了有限自动机，很麻烦，这里由于只有两个符号，而且数据也不大，我们直接模拟+递归就可以A掉。

我们首先考虑两种符号的情况，第一种是*，一种是^， 其中*我们可以当作任意字符处理，我们就直接递归变成 isMatch(s[1...n],p[1...n]); 一种是^， 我们在遍历的时候就直接判断这一位的下一位是不是^，如果是的话直接循环，找到所有可能的情况进行递归，这样的时间复杂度是O(n^2)。剩下的问题只需要考虑循环到空和^表示0个的特殊情况，感觉因为简化的过多，真正的正则表达应该要复杂多了。

### Update1: 动规做法

其实这道题也可以用动规的方法来做，我们可以用dp[i][j]来表示s前i位和p的前j位是否匹配，因为有*的存在，我们需要像无限背包问题来考虑匹配的个数，可以是0个，也可以是1个，也可以是更多。所以当dp[i][j-2]或者dp[i-k][j-2]其中存在为真的时候，我们可以说dp[i][j]为真。另外如果我们遇到正常的字符或者.,如果匹配，我们直接递归到dp[i-1][j-1]即可。
