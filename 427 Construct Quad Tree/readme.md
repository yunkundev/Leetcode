# 427. Construct Quad Tree

### Solution:

This is a problem which is not hard to resolve. We know for the region have just one value or all the values is same, we just regard it as one nodes. For those region that have more than one values, we can divide it into four parts and solve it with the same method we have. So this problem can quickly solved by recursion method.