# 818. Race Car

Your car starts at position 0 and speed +1 on an infinite number line.  (Your car can go into negative positions.)

Your car drives automatically according to a sequence of instructions A (accelerate) and R (reverse).

When you get an instruction "A", your car does the following: position += speed, speed *= 2.

When you get an instruction "R", your car does the following: if your speed is positive then speed = -1 , otherwise speed = 1.  (Your position stays the same.)

For example, after commands "AAR", your car goes to positions 0->1->3->3, and your speed goes to 1->2->4->-1.

Now for some target position, say the length of the shortest sequence of instructions to get there.

### Example 1:
**Input:** 

target = 3

**Output:** 2

**Explanation:** 

The shortest instruction sequence is "AA".

Your position goes from 0->1->3.

### Example 2:
**Input:**

target = 6

**Output:** 5

**Explanation:**

The shortest instruction sequence is "AAARA".

Your position goes from 0->1->3->7->7->6.

### Note:

1 <= target <= 10000.

## Solution1: BFS

This is really a hard problem. I use a lot of time to understand this problem, and the key to solve this problem is to do some daring hypothesis which can help us solve the problem.

The first try to solve this problem is just using BFS search. But we need some pruning to improve the speed, otherwise we will  have a Time Limited Error.

Every step there are just 2 operations we can do, the first one is A, and the second one is R, we should BFS to simulate these two operation. We can do 2 pruning which can help us be more quick:

* The first pruning is the if the **absolute value** of speed or the position beyond the double of target, we can remove those node
*  The second pruning is that we should use a hashSet to memorize the node we have visited and not visit the node again. We can just remember those node with speed 1 which all other node is devide by these speed 1 node.



```
    class status
    {
        int position;
        int speed;
        public status(int pos, int spd)
        {
            position = pos;
            speed = spd;
        }
        public int hash()
        {
            return 100000*speed+position;
        }
    }
    
    
    public int racecar(int target) 
    {
        status start = new status(0, 1);
        Queue<status> queue = new LinkedList<status>();
        queue.offer(start);
        Set<Integer> visited = new HashSet<Integer>();
        int step = 0;
        while(queue.size() > 0)
        {
            int size = queue.size();
            step++;
            for(int i = 0; i < size; i++)
            {
                status s = queue.poll();
                //System.out.println(s.position +" "+ s.speed);
                
                
                int nextpos = s.position + s.speed;
                if(nextpos == target) return step;
                int nextspeed = s.speed * 2;                
                
                if(Math.abs(s.speed) < 2*target && Math.abs(s.position) < 2*target) 
                {
                    status s1 = new status(nextpos, nextspeed);
                    queue.offer(s1);
                }
                
                nextspeed = (s.speed > 0)? -1 : 1; 
                status s2 = new status(s.position, nextspeed);
                if(!visited.contains(s2.hash())) 
                {
                    visited.add(s2.hash());
                    queue.offer(s2);
                }
                
            }
        }
        return -1;
        
    }

```

## Solution2: DP(Buttom-Up)

The Dynamic Programming method is much harder to image. It base on one assume that if we want go to the place i(in the range from [2^(n-1)  , 2^n - 1]), there are two ways to do this, first way is to go directly to the 2^n-1, and turn around to go back and go the remains (2^n - 1 - i). second way is go to the 2^(n-1)-1, and turn back go k and turn around to go the total i - (2^(n-1)-1)+k which k is related to the step j which smaller than the i.

So the transfer function is:

**dp[i] = n + 1+ dp[(1<<n)-1-i]**

**dp[i] = n - 1 + 2 + j + dp[i- (1<<(n-1))  + (1<<(j))] {0 <= j < i}**

We should pay attention to some points:

1. The arange of the j can pick: we can not move j = 0, and we can move at most i-1 step
2. We should really care about the how get the truely range using the log and ceil function.

```
    public int racecar(int target) 
    {
        
        int[] dp = new int[target+1];
        
        for(int i = 1; i <= target; i++)
        {
            int n = (int)(Math.log(i)/Math.log(2.0)) + 1;
            if(i == (int)((1<<n)-1))
            {
                dp[i] = n;
            }
            else
            {
                dp[i] = n + 1+ dp[(1<<n)-1-i];
                for(int j = 0; j < n-1; j++)
                {
                    dp[i] = Math.min(dp[i], n - 1 + 2 + j + dp[i- (1<<(n-1))  + (1<<(j))]);
                }
            }
            
        }
        return dp[target];
    }
```

## Solution3: Recursion with Memoralization

we can also use the recursion with memoralization which is more easier to think.


```
    Map<Integer, Integer> map;
    public int dp(int i)
    {
        if(map.containsKey(i)) return map.get(i);
        int n = (int)Math.ceil(Math.log(i+1)/Math.log(2.0));
        int res = Integer.MAX_VALUE;
        if(i == (int)((1<<n)-1))
        {
            res = n;
        }
        else
        {
            res = n + 1+ dp((1<<n)-1-i);
            for(int j = 0; j < n-1; j++)
            {
                res = Math.min(res, n - 1 + 2 + j + dp(i- (1<<(n-1))  + (1<<(j))));
            }
        }
            
        map.put(i, res);
        return res;
        
    }
    
    
    
    public int racecar(int target) 
    {
        map = new HashMap<Integer, Integer>();
        return dp(target);            
    }
```