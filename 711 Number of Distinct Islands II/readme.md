# 711. Number of Distinct Islands II

Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Count the number of distinct islands. An island is considered to be the same as another if they have the same shape, or have the same shape after rotation (90, 180, or 270 degrees only) or reflection (left/right direction or up/down direction).

### Solution:

This problem is very similiar to the last problem, we should translate the island to the (0, 0) and the most useful skill is to find the rotation of the shape. We can list all the rotation and reflection shape by (x, y), (-x, y), (x, -y), (-x, -y), (y, x), (-y, x), (y, -x), (-y, -x). So we can get all the shape and compare them to avoid repeat.