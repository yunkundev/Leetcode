# 812. Largest Triangle Area

We have a list of bus routes. Each routes[i] is a bus route that the i-th bus repeats forever. For example if routes[0] = [1, 5, 7], this means that the first bus (0-th indexed) travels in the sequence 1->5->7->1->5->7->1->... forever.

We start at bus stop S (initially not on a bus), and we want to go to bus stop T. Travelling by buses only, what is the least number of buses we must take to reach our destination? Return -1 if it is not possible.

### Example:
**Input:**

routes = [[1, 2, 7], [3, 6, 7]]

S = 1

T = 6

**Output:** 2

**Explanation:** 

The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.


### Note:

1. 1 <= routes.length <= 500.
2. 1 <= routes[i].length <= 500.
3. 0 <= routes[i][j] < 10 ^ 6.

## Solution: BFS

This is a problem which can regard as graph prblems. There are a edges between the route which they both in the same stop. We can build the graph use the HashMap store the all the route have same stop, all the route link to the all stop of the route can regard as the next node in the graph. After that, we can use the normal BFS to solve this problem.

```
    public int numBusesToDestination(int[][] routes, int S, int T) 
    {
        if(S == T) return 0;
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for(int i = 0; i < routes.length; i++)
        {
            for(int j = 0; j < routes[i].length; j++)
            {
                int stop = routes[i][j];
                if(!map.containsKey(stop)) map.put(stop, new ArrayList<Integer>());
                map.get(stop).add(i);
            }
        }
        

        Set<Integer> visited_s = new HashSet<Integer>();       
        Set<Integer> visited_b = new HashSet<Integer>();
        int step = 1;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(S);
        visited_s.add(S);
        
        while(queue.size() > 0)
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                int p = queue.poll();
                for(int j:map.get(p))
                {
                    if(visited_b.contains(j)) continue;
                    else visited_b.add(j);
                    for(int k:routes[j])
                    {
                        if(k == T)
                        {
                            return step;
                        }
                        if(!visited_s.contains(k))
                        {
                            queue.offer(k);
                            visited_s.add(k);
                        }
                    }
                    
                }
            }
            step++;
        }
        return -1;
        
        
    }
```