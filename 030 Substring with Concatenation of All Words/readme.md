#030 Substring with Concatenation of All Words

You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

### example:
s: "barfoothefoobarman"
words: ["foo", "bar"]

You should return the indices: [0,9].
(order does not matter).

### Solution:
这道题寻找的是包含所有文字的子串，其实感觉有很多的办法能解决这个问题。因为这道题给的字典比较特殊，他的每个字符串长度都是相同的假设为k，所以我们可以分出k个小字符串然后依次推进k个来寻找。寻找的过程我受到前面的题的启发，用了start和end两个节点来记录情况，如果出现部分在前面的情况，我们这里就可以通过改变start来将前面重复的部分去掉，这样我们每种情况只需要扫描一遍，遇到能满足字典里所有的词的情况，输出即可。

### Update1:
后来仔细看了看，发现其实这道题并不用自己想的那么麻烦，自己想的许多小trick其实并不一定起到来多少作用，自己受到第三题的影响，在这道题用到来扫描窗口等方法其实使问题变得更加复杂了。如果我们用暴力的方法，利用哈希表来处理节点的情况的话，总时间复杂度也仅仅是o(mn),最后也能通过。
