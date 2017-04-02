public class Solution
{
    public List<Integer> findSubstring(String s, String[] words)
    {
        int wordLength = words[0].length();
        int sLength = s.length();
        List<Integer> res = new ArrayList<Integer>();
        // Intialization hashmap
        HashMap<String, Integer> map= new HashMap<String,Integer>();
        HashMap<String, Integer> new_map = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++)
        {
            if(map.containsKey(words[i]))
            {
                int v = map.get(words[i]);
                map.put(words[i], v+1);

            }
            else
            {
                map.put(words[i], 1);
            }

        }

        for(int i = 0; i <= sLength - words.length*wordLength; i++)
        {
            new_map = new HashMap<String, Integer>(map);
            for(int j = 0; j < words.length ; j++ )
            {
                String subword = s.substring(i+j*wordLength, i+j*wordLength+wordLength);
                if(new_map.containsKey(subword))
                {
                    int c = new_map.get(subword)-1;
                    if(c == 0) new_map.remove(subword);
                    else new_map.put(subword,c);
                }
                else
                {
                    break;
                }
            }
            if(new_map.size() == 0) res.add(i);
        }
        return res;
    }
}
