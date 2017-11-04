class MagicDictionary
{
    
    HashSet<String> set;
    /** Initialize your data structure here. */
    public MagicDictionary()
    {
        set = new HashSet<String>();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict)
    {
        for(String s:dict)
        {
            set.add(s);
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word)
    {
        char[] ca = word.toCharArray();
        for(int i = 0; i < word.length(); i++)
        {
            char c = ca[i];
            for(char j = 'a'; j <= 'z'; j++)
            {
                if(j != c)
                {
                    ca[i] = j;
                    String sp = String.valueOf(ca);
                    if(set.contains(sp)) return true;
                }
            }
            ca[i] = c;
        }
        return false;
    }
}
