class Solution 
{
    public int kthSmallest(int[][] matrix, int k) 
    {
        int n = matrix.length;
        if(n == 0) return 0;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];
        //lower bound
        while(left < right)
        {
           
            int mid = left + (right - left)/2;
            System.out.println(left + " " + right + " " +mid);
            int i = 0;
            int count = 0;
            for(int j = n-1; j >= 0; j--)
            {
                
                while(i < n && matrix[i][j] <= mid ) i++;
                //System.out.println(i);
                count += i;
            }
            System.out.println(count );
            if(count < k) left = mid +1;
            else if(count == k) right = mid;
            else right = mid;
        }
        return left;
        
    }
}