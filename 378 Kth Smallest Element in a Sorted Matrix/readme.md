# 378. Kth Smallest Element in a Sorted Matrix

Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

### Sulution:

The most easy way is to story all the elements in an array and sort it. But this cost O(n^2) time which not is not good enough.

Another way to do this is to use bfs + minheap, every time we just get and delete the smallest element in the heap and insert all the element close to it which means it is possible to be the next min value. This method take O(KlongK) time which is very good but the we should write the Comparator of the pair of value and position.

The most tanlented way to do this is inspired by 240.Search a 2D Matrix and Binary Search. The main thought of this operation is we can know the max value and min value in the matrix, so we know the range of all the value. The Kth Smallest Element must in this range. So the problem is change to find a value which is the lower bound of value have the k-1 small/equal element. We can use binary search to solve this problem. There is a track of this problem which we should take care of. Because there existed equal elements, so there maybe not exist the element have k-1, we what we want to find is not the value it exist but the value it will be insert in lower bound. So we should considered the the two posibble < and >= and not <, >, = which can find the insert possition of the value.