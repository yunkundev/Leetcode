# 823. Binary Trees With Factors

Given an array of unique integers, each integer is strictly greater than 1.

We make a binary tree using these integers and each number may be used for any number of times.

Each non-leaf node's value should be equal to the product of the values of it's children.

How many binary trees can we make?  Return the answer modulo 10 ** 9 + 7.

### Example 1:

Input: A = [2, 4]

Output: 3

Explanation: We can make these trees: [2], [4], [4, 2, 2]

### Example 2:

Input: A = [2, 4, 5, 10]

Output: 7

Explanation: We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2].

### Note:

1. 1 <= A.length <= 1000.
2. 1<= A[i] <= 10 ^ 9.

## Solution:

My solution is for every number, we detect whether we can compose a new bigger new node with the number in the front.


```
   public int numFactoredBinaryTrees(int[] A) 
   {
        Arrays.sort(A);
        long[] mount = new long[A.length];
        for(int i = 0; i < A.length; i++) mount[i] = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) map.put(A[i], i);
        //int past = 0;
        for(int i = 0; i < A.length; i++)
        {

            long p1 = (long)(A[i])*(long)(A[i]);
            if(p1 <= (long)(Integer.MAX_VALUE) && map.containsKey(A[i]*A[i]))
            {
                int index = map.get(A[i]*A[i]);
                mount[index] += mount[i]*mount[i];
                mount[index] = mount[index]%1000000007;
            }
            for(int j = 0; j < i; j++)
            {
                long p2 = (long)(A[i])*(long)(A[j]);
                if(p2 <= (long)(Integer.MAX_VALUE) && map.containsKey(A[i]*A[j]))
                {
                    int index = map.get(A[i]*A[j]);
                    mount[index] += 2*mount[i]*mount[j];
                    mount[index] = mount[index]%1000000007;
                }
            }
            
            // for(int k = 0; k < A.length; k++) 
            // {
            //     System.out.print(mount[k]+" ");
            // }
            // System.out.println();
        }
        long count = 0;
        for(int i = 0; i < A.length; i++) 
        {
            //System.out.println(mount[i]);
            count = (count + mount[i])%1000000007;
        }
        
        
        return (int)count;
   }

```

## Improve:

My idea is ok but there is a more easy way to deal with this problem that we should just detect the amount of number in the time we visited it. It have the same time complexity and it not need to deal with the mulitply overflow.

It can regard as this:
* we get A[i], we traversal to get A[j] -> we detect wheter we can compose node A[i]*A[j]

* we get A[i], we traversal to get A[j] -> we detect whether we can find the node A[i]/A[j]


```
    public int numFactoredBinaryTrees(int[] A) 
    {
        Arrays.sort(A);
        int mod = (int)Math.pow(10, 9) + 7;
        long[] mount = new long[A.length];
        for(int i = 0; i < A.length; i++) mount[i] = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) map.put(A[i], i);
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
                if(A[i]%A[j] == 0 && map.containsKey(A[i]/A[j]))
                {
                    mount[i] += mount[j]*mount[map.get(A[i]/A[j])];
                    mount[i] = mount[i]%mod;
                }
            }
        }
        long count = 0;
        for(int i = 0; i < A.length; i++) 
        {
            count = (count + mount[i])%mod;
        }
        
        
        return (int)count;
    }


```