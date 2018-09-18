# 478. Generate Random Point in a Circle

## Solution:

This is a hard problem about random. How can we get a random point in a circle. Firstly, what we thought is that we should get a angle (0-2pi). After that, we get the line with same probability. At that line, we can find the position in the line. We can use the sqrt to make sure the point near the center and the point near the circumference have the same possibility.

