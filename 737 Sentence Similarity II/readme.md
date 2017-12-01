# 737. Sentence Similarity II

Given two sentences words1, words2 (each represented as an array of strings), and a list of similar word pairs pairs, determine if two sentences are similar.


For example, words1 = ["great", "acting", "skills"] and words2 = ["fine", "drama", "talent"] are similar, if the similar word pairs are pairs = [["great", "good"], ["fine", "good"], ["acting","drama"], ["skills","talent"]].


Note that the similarity relation is transitive. For example, if "great" and "good" are similar, and "fine" and "good" are similar, then "great" and "fine" are similar.


Similarity is also symmetric. For example, "great" and "fine" being similar is the same as "fine" and "great" being similar.


Also, a word is always similar with itself. For example, the sentences words1 = ["great"], words2 = ["great"], pairs = [] are similar, even though there are no specified similar word pairs.


Finally, sentences can only be similar if they have the same number of words. So a sentence like words1 = ["great"] can never be similar to words2 = ["doubleplus","good"].

Note:

The length of words1 and words2 will not exceed 1000.

The length of pairs will not exceed 2000.

The length of each pairs[i] will be 2.

The length of each words[i] and pairs[i][j] will be in the range [1, 20].

### Solution:

This question is a little bit differetn from 734, Sentence Similarity which the similiar relation is transtive. You can regard it as Union-Find problem which the similiar relation can think union operation. We can put all the union in a HashMap, if any one of word have not appear before, the only thing we should to do set the new word with the index of anonther one. If all the two words has appear before, we should union them in our HashMap.

### Improvement:

We can improve the complexity of Union-Find with Quick-Union and path compression. (Seen AC2.java) The last implement I use is QuickFind we just set the index of each one. We regard the union-find like a tree which we can find the parent by O(nlogn) and use path compression to avoid the worst case.

