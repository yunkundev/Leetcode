#  676. Implement Magic Dictionary

Implement a magic directory with buildDict, and search methods.

For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.

For the method search, you'll be given a word, and judge whether if you modify exactly one character into another character in this word, the modified word is in the dictionary you just built.

Note:
You may assume that all the inputs are consist of lowercase letters a-z.
For contest purpose, the test data is rather small by now. You could think about highly efficient algorithm after the contest.
Please remember to RESET your class variables declared in class MagicDictionary, as static/class variables are persisted across multiple test cases. Please see here for more details.

### Solution:

This question is very similiar with the Leetcode 127 Word Ladder, which talk about is there a word which just replace one word in my word dictionary. We can just replace the every character of Stirng to another 25 character.

A more smarter operation is do some operators in build Dictionary. We should split the the String by every character in the String and insert the split String into the HashMap. We can use the String also split by same index and find it.


