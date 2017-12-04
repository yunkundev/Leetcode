class NumMatrix 
{
    //Binary Index Tree
    int[] array;
    int[] bit;
    int m;
    int n;
    public NumMatrix(int[][] matrix) 
    {
        m = matrix.length;
        if(m == 0) n = 0;
        else n = matrix[0].length;
        array = new int[m*n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                array[i*n+j] = matrix[i][j];
            }
        }
        bit = new int[m*n+1];
        //System.out.println(m*n);
        for(int i = 0; i < m*n; i++)
        {
            int index = i+1;
            while(index <= m*n)
            {
                bit[index] += array[i];
                index += (index & -index);
            }
        }
        
        //for(int i:bit) System.out.print(i+" ");
        //System.out.println();
    }
    
    public void update(int row, int col, int val) 
    {
        //System.out.println("Update: "+ col + " " + val);
        int inc = val - array[row*n+col];
        int index = row*n + col + 1;
        while(index <= m*n)
        {
            bit[index] += inc;
            index += (index & - index);
        }
        array[row*n+col] = val;
    }
    
    
    public int getSum(int index)
    {
        index++;
        int sum = 0;
        while(index > 0)
        {
            //System.out.println(index);   
            sum += bit[index];
            index -= (index & -index);
        }
        return sum;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) 
    {
        //System.out.println("Sum:" + " " + row1 + " " + col1 + " " + row2 + " " + col2);
        int sum = 0;
        for(int i = row1; i <= row2; i++)
        {
            
            sum += getSum(i*n+col2) - getSum(i*n+col1-1);
        }
        return sum;
    }
}