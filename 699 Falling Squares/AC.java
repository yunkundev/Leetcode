class Solution
{
    public List<Integer> fallingSquares(int[][] positions)
    {
        List<int[]> list = new ArrayList<int[]>();
        List<Integer> res = new ArrayList<Integer>();
        int tmax = 0;
        for(int i = 0; i < positions.length; i++)
        {
            int left = positions[i][0];
            int right = positions[i][0]+positions[i][1]-1;
            int length = positions[i][1];
            //System.out.println(left +" "+ right);
            int max = 0;
            for(int[] itv: list)
            {
                if(itv[1] < left) continue;
                if(itv[0] > right) continue;
                max = Math.max(max, itv[2]);
            }
            length += max;
            tmax = Math.max(tmax, length);
            res.add(tmax);
            int[] interval = {left, right, length};
            list.add(interval);
        }
        return res;
    }
}