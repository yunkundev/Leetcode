# 715. Range Module

A Range Module is a module that tracks ranges of numbers. Your task is to design and implement the following interfaces in an efficient manner.

addRange(int left, int right) Adds the half-open interval [left, right), tracking every real number in that interval. Adding an interval that partially overlaps with currently tracked numbers should add any numbers in the interval [left, right) that are not already tracked.


queryRange(int left, int right) Returns true if and only if every real number in the interval [left, right) is currently being tracked.


removeRange(int left, int right) Stops tracking every real number currently being tracked in the interval [left, right).

### Solution:
This is a problem about dealing with intervals. the operation of add can think as using new range to replace the old range, the removeRange think as replace the old range with one or two smaller range. I use list to store the interval here, but I think TreeSet is more suitable for this problem because it can find the index of add and query in O(logn)