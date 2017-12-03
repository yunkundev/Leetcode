# 269. Alien Dictionary

There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you. You receive a list of non-empty words from the dictionary, where words are sorted lexicographically by the rules of this new language. Derive the order of letters in this language.

### Solution:

This is not a hard problem. We can get the some compare relationship with the first different character and we can infer the sort with the thought of Topological sort.
