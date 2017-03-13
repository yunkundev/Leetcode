public class Solution
{
    public String intToRoman(int num)
    {
        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rom = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String s = "";
        for(int i = 0; i < nums.length ; i++)
        {
            int c = num/nums[i];
            num = num%nums[i];

            for(int j = 0; j < c; j++)
            {
                s = s.concat(rom[i]);
            }

        }
        return s;

    }
}
