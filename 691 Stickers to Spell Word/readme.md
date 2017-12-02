# 691. Stickers to Spell Word

We are given N different types of stickers. Each sticker has a lowercase English word on it.

You would like to spell out the given target string by cutting individual letters from your collection of stickers and rearranging them.

You can use each sticker more than once if you want, and you have infinite quantities of each sticker.

What is the minimum number of stickers that you need to spell out the target? If the task is impossible, return -1.

### Solution:

We can use Dynamic programming or Memoric Search to solve this problem. Every step we can get a new result with the any sticker we have, we can drop the stick have not efficent and use HashMap to record all the min target we get.