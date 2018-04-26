264. Ugly Number II

Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

Note that 1 is typically treated as an ugly number, and n does not exceed 1690.

### Solution:

This problem can be done by a lot of methods. The most effective way is to use three indexs to store the place the next number can choosen as the next one in the sequence. We can compare all the three candidate and choose the smallest one as the next number, and make the index move the the next position in the sequecne  unitl find the n-th number.