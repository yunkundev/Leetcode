class Solution
{
    public int scheduleCourse(int[][] courses) 
    {
        int amount = 0;
        int cnt = 0;
        Arrays.sort(courses, new Comparator<int[]>(){
            public int compare(int[] a, int[] b)
            {
                if(a[1] == b[1]) return a[0] - b[0];
                else return a[1] - b[1];
            }
        });
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(courses.length, Collections.reverseOrder());
        for(int i = 0; i < courses.length; i++)
        {
            //System.out.println(amount +" "+courses[i][0]+" "+courses[i][1]);
            if(amount + courses[i][0] <= courses[i][1])
            {
                amount += courses[i][0];
                cnt ++;
                pq.offer(courses[i][0]);
            }
            else
            {
                
                
                pq.offer(courses[i][0]);
                int max = pq.poll();
                amount -= max - courses[i][0];
                //System.out.println(max + " " +amount);

            }
            
        }
        return cnt;
    }
}