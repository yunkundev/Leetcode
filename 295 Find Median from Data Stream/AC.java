class MedianFinder 
{

    int len;
    double mid;
    PriorityQueue<Integer> bigger;
    PriorityQueue<Integer> smaller;
    /** initialize your data structure here. */
    public MedianFinder() 
    {
        len = 0;
        bigger = new PriorityQueue<Integer>();
        smaller = new PriorityQueue<Integer>();
        
    }
    
    public void addNum(int num)
    {
        bigger.offer(num);
        smaller.offer(-bigger.poll());
        if(bigger.size() < smaller.size())
            bigger.offer(-smaller.poll());
    }
    
    public double findMedian() 
    {
         if(bigger.size() == smaller.size())
         {
             return (double)(bigger.peek() - smaller.peek())/2;
         }
         else
         {
             return (double)(bigger.peek());
         }
    }
}