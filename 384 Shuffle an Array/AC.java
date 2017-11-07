class Solution
{
    int[] array;
    int n;
    public Solution(int[] nums)
    {
        array = nums;
        n = nums.length;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset()
    {
        return array;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle()
    {
        int[] new_array = new int[n];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(array[i]);
        }
        
        for(int i = 0; i < n; i++)
        {
            Random rdm = new Random();
            int r = rdm.nextInt(list.size());
            new_array[i] = list.get(r);
            list.remove(r);
        }
        return new_array;
    }
}
