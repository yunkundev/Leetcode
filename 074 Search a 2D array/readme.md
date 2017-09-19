# 74. Search a 2D Matrix

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[

  [1,   3,  5,  7],

  [10, 11, 16, 20],
  
  [23, 30, 34, 50]

]

Given target = 3, return true.


### Sulution:

这道题主要的考察是对多维数组的处理，比如在这里我们遇到了一个二维数组，我们可以将这个二维数组转化成我们想要的一维数组形式，这样就能够很方便的解决这道题啦。