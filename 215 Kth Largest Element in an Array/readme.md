# 215. Kth Largest Element in an Array

Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.


### Solution:

This is a very important problem which is to find the k-largest or k-smallest element in the array with quick select method. We should care about the problem of operation of partition. Take care of equal situation, take care of the place to do the swap operation and the remain number of the next part.