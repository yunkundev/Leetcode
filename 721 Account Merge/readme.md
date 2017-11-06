#  721. Account Merge

Given a list accounts, each element accounts[i] is a list of strings, where the first element accounts[i][0] is a name, and the rest of the elements are emails representing emails of the account.

Now, we would like to merge these accounts. Two accounts definitely belong to the same person if there is some email that is common to both accounts. Note that even if two accounts have the same name, they may belong to different people as people could have the same name. A person can have any number of accounts initially, but all of their accounts definitely have the same name.

After merging the accounts, return the accounts in the following format: the first element of each account is the name, and the rest of the elements are emails in sorted order. The accounts themselves can be returned in any order.

### Solution:

This is a large simulation problem. There are two though of this problem:

1, Use DFS to find all the vertex and find all the account same with the this one in one time.

2, Use Union-Found to calculate all the account in one union.

Both solution is very complex to write. I should more confident and patient to solve this problem which can help me solve those problem more quickly.
