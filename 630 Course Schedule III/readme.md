# 630. Course Schedule III

There are n different online courses numbered from 1 to n. Each course has some duration(course length) t and closed on dth day. A course should be taken continuously for t days and must be finished before or on the dth day. You will start at the 1st day.

Given n online courses represented by pairs (t,d), your task is to find the maximal number of courses that can be taken.

### Solution:

This problem can be solved by the greedy method. Firstly we sort all the courses by the time and end clock. Every step we want the maximal number of courses, if we cannot complete the course in the time, we replace the goal to achieve smallest total time which replace the maximal course duration in past with the temp one.