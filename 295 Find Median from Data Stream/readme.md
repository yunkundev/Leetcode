# 295. Find Median from Data Stream

Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

Examples: 
[2,3,4] , the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.

double findMedian() - Return the median of all elements so far.

### Solution:

This problem is about to maintain the median of the data stream. One of the most smart way to do this is to use a min-heap to maintain all the value bigger than median and a max-heap to maintain all the value smaller than median. At the same time we get name from Data Stream, we keep the min-heap's size equal or less than 1 compare to the max-heap with the method that we can peek element to other heap to keep the balence of two heap and keep track of median.