# 813. Largest Sum of Averages

We partition a row of numbers A into at most K adjacent (non-empty) groups, then our score is the sum of the average of each group. What is the largest score we can achieve?

Note that our partition must use every number in A, and that scores are not necessarily integers.

### Example:
Input: 

A = [9,1,2,3,9]

K = 3

Output: 20

Explanation: 

The best choice is to partition A into [9], [1, 2, 3], [9]. The answer is 9 + (1 + 2 + 3) / 3 + 9 = 20.
We could have also partitioned A into [9, 1], [2], [3, 9], for example.
That partition would lead to a score of 5 + 2 + 6 = 13, which is worse.


### Note:

1. 1 <= A.length <= 100.
2. 1 <= A[i] <= 10000.
3. 1 <= K <= A.length.
4. Answers within 10^-6 of the correct answer will be accepted as correct.

## Solution: DP
This is interval DP problem which we can get the answer base on the smaller interval. There are some problem we should be very careful to deal with.

1. We should use preSum method to help use to calculate the median.
2. Another thing is that we should confirm where we should start our traversal.


```
    public double largestSumOfAverages(int[] A, int K)
    {
        int n = A.length;
        //dp[i][j]: max avg sum of first i elements partitioned into k groups
        //dp[k][i] = max(dp[k-1][j] + avg(a[j+1], ..., a[i]));
        double[] dp = new double[n+1];
        int[] sum = new int[n+1];
        for(int i = 1; i <= n; i++)
        {
            sum[i] = sum[i-1] + A[i-1];
            dp[i] = (double)(sum[i])/i;
        }
        
        
        for(int k = 2; k <= K; k++)
        {
            double[] tmp = new double[n+1];
            for(int i = k; i <= n; i++)
            {
                for(int j = k-1; j < i; j++)
                {
                    tmp[i] = Math.max(tmp[i], dp[j] + (double)(sum[i] - sum[j])/(i-j));
                }
            }
            for(int i = k; i <= n; i++) dp[i] = tmp[i];
        }
        
        return dp[n];
        
    }
```