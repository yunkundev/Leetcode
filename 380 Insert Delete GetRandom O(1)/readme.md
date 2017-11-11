# 380. Insert Delete GetRandom O(1)

Design a data structure that supports all following operations in average O(1) time.

*insert(val): Inserts an item val to the set if not already present.

*remove(val): Removes an item val from the set if present.

*getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.

### Solution:

The most hard place of this problem is to do all those things in average O(1) time. If we use HashMap, we can insert and remove the elment in O(1) time, but we can not do the getRandom in O(1) time. If we use List(), we can easily  insert and get the Random in O(1) time, but it is hard to remove the element in O(1) time. The way we solve this problem is to combine the List and HashMap. We mainly use the List to store all the elements and getRandom, but we use the HashMap to help delete the element in O(1) time. The trick we use here is to exchange the element we want to delete and the last element in the list, and remove the last element in the list. There are two benefit of this exchange operating, first one is we can use HashMap to find the element and delete it which just in O(1) time because we do not need to find and travel the list, the second is that the position of else element in HashMap will not influened by this operation which can help us to find the position of element afterward.