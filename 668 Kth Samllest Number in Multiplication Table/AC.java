class Solution 
{
    
    public int Find(int m, int n, int mid)
    {
        int i = 1;
        int j = n;
        int count = 0;
        while( j >= 1)
        {
            while(i * j <= mid && i <= m)
            {
                i++;
            }
            count += i-1;
            j--;
        }
        return count;
    }
    
    public int findKthNumber(int m, int n, int k)
    {
        
        int start = 0;
        int end = m*n;
        while(start < end)
        {
            int mid = (start + end)/2;
            int num = Find(m, n, mid);
            if(num >= k) end = mid; 
            else start = mid + 1;
        }
        return start;
    }
}