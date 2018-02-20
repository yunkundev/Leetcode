# 496. Next Greater Element I

You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.


The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

### Solution:

This problem can change it to the problem of finding the biggest element after the element. We can use the knowledge we get from the **84. Largest Rectangle in Histogram** and we can easily get the next greater element use the collection stack. From the right to left, every time we put the new number into the stack. If there is any number smaller than it, you can just pop it out; if there is no element or the top of the stack is bigger than it, we can push the number into stack. To do so, we maintain a incleasing only stack and the number in the stack is all the candidate can be the answer.