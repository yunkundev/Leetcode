public class Solution
{
    public String convert(String s, int numRows)
    {
        String[] row = new String[numRows];
        for(int i = 0; i < numRows; i++)
        {
            row[i] = "";
        }
        for(int i = 0; i < s.length(); i++)
        {
            int pos;
            if(numRows > 1) pos = i%(2*numRows-2);
            else pos = 0;
            if(pos >= numRows) pos = 2*numRows - pos - 2;
            row[pos] = row[pos] + String.valueOf( s.charAt(i) );
        }
        String sr = "";
        for(int i = 0; i < numRows; i++)
        {
            sr = sr + row[i];
        }
        return sr;

    }
}
