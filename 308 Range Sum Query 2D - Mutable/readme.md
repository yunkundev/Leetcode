# 308. Range Sum Query 2D - Mutable

Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

### Solution:

This is a problem about point updating and range query. We can definitely think about using Binary Index Tree and Segment Tree. Their exist a kind of 2D binary index tree which make us easily get the sum of rectangle. The thought is almost same but just apply it to 2 loop.

int getSum(int BIT[][N+1], int x, int y)
{
    int sum = 0;
 
    for(; x > 0; x -= x&-x)
    {
        // This loop sum through all the 1D BIT
        // inside the array of 1D BIT = BIT[x]
        for(; y > 0; y -= y&-y)
        {
            sum += BIT[x][y];
        }
    }
    return sum;
}

void updateBIT(int BIT[][N+1], int x, int y, int val)
{
    for (; x <= N; x += (x & -x))
    {
        // This loop update all the 1D BIT inside the
        // array of 1D BIT = BIT[x]
        for (; y <= N; y += (y & -y))
            BIT[x][y] += val;
    }
    return;
}

