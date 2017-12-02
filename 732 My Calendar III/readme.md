# 732. My Calendar III

Implement a MyCalendarThree class to store your events. A new event can always be added.

Your class will have one method, book(int start, int end). Formally, this represents a booking on the half open interval [start, end), the range of real numbers x such that start <= x < end.

A K-booking happens when K events have some non-empty intersection (ie., there is some time that is common to all K events.)

For each call to the method MyCalendar.book, return an integer K representing the largest integer such that there exists a K-booking in the calendar.

Your class will be called like this: MyCalendarThree cal = new MyCalendarThree(); MyCalendarThree.book(start, end)


### Solution:

This is a quesition ask about the overlop of the interval. One of the staight way is to use segement tree. We you meet the interval you want to overlop, you can translate to split the interval and calculate the times overlop happen. 

But there is a smarter way to solve this problem. That way is Boundary Count. You can count the start boundary and end boundary. You can travel from the start to end, when you meet the start, count ++; when you meet the end, count--. We can use TreeMap to store the boudary and travel from the smallest to the highest.