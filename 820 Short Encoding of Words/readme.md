# 820. Short Encoding of Words

Given a list of words, we may encode it by writing a reference string S and a list of indexes A.

For example, if the list of words is ["time", "me", "bell"], we can write it as S = "time#bell#" and indexes = [0, 2, 5].

Then for each index, we will recover the word by reading from the reference string from that index until we reach a "#" character.

What is the length of the shortest reference string S possible that encodes the given words?

### Example:

Input: words = ["time", "me", "bell"]

Output: 10

Explanation: S = "time#bell#" and indexes = [0, 2, 5].

### Note:

1. 1 <= words.length <= 2000.

2. 1 <= words[i].length <= 7.

3. Each word has only lowercase letters.

## Solution: HashSet [Accepted]

My first thought about this problem is that we should delete all the string that is a suffix of the other string. For example, we should delete "me" because we already have word "time" since the "time#" can represent the "me".

My solution is fristly reverse all the words, using the HashSet to store all the prefix of this word, if the word we visited now is not a prefix of any other word, we can increase the result by length()+1. We can first sort the array by the length of string then we don't need to compare the string visit now have a prefix with the former one.

Also, Trie tree is also ok for this problem, but it is much hard to implement and it have the same time complexity and space complexity. So we can just use the HashMap to deal with the prefix problem.

```
    public int minimumLengthEncoding(String[] words) 
    {
        Arrays.sort(words, new Comparator<String>(){
           public int compare(String a, String b)
           {
               return b.length() - a.length();
           }
        });
        
        Set<String> set = new HashSet<String>();
        int count = 0;
        for(String str:words)
        {
            String s = new StringBuilder(str).reverse().toString();
            if(!set.contains(s)) count += s.length() + 1;
            for(int i = 1; i <= s.length(); i ++)
            {
                set.add(s.substring(0, i));
            }
        }
        return count;
    }

```

**Time complexity:** O(N*K)

**Sapce complexity:** O(N*K^2)

## Imporve

There are some poits I didn't caught up at the first time:

1, We don't need to reverse the string to change the suffix problem to the prefix problem because we can directly deal with string's suffix.

2, The another way we can improve is that we needn't to detach every string whether it should be retained or not. We can just assume that all the words is include and remove the word we don't need any more (is a suffix of another word).

The modified code is here(Runtime: 62ms -> 36ms)

```
    public int minimumLengthEncoding(String[] words) 
    {
        
        Set<String> set = new HashSet(Arrays.asList(words));
        for(String str:words)
        {
            for(int i = 1; i < str.length(); i ++)
            {
                set.remove(str.substring(i));
            }
        }
        int count = 0;
        for(String str:set) count += str.length()+1;
        return count;
    }

```

**Time complexity:** O(N*K)

**Sapce complexity:** O(N*K)