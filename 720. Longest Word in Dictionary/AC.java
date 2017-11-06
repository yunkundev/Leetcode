class Solution
{
    static class TrieNode
    {
        boolean wordEnd;
        TrieNode[] childs = new TrieNode[26];
        TrieNode()
        {
            wordEnd = false;
            for(int i = 0; i < 26; i++)
            {
                childs[i] = null;
            }
        }
    }
    public TrieNode buildTrie(String[] words)
    {
        TrieNode root = new TrieNode();
        for(String s:words)
        {
            TrieNode node = root;
            for(int i = 0; i < s.length(); i++)
            {
                int index = s.charAt(i) - 'a';
                if(node.childs[index] == null)
                {
                    node.childs[index] = new TrieNode();
                }
                node = node.childs[index];
            }
            node.wordEnd = true;
        }
        return root;
    }
    
    int maxlen;
    String res;
    public void dfs(TrieNode root, int len, String s)
    {
        int count = 0;
        for(int i = 0; i < 26; i++)
        {
            if(root.childs[i] != null && root.childs[i].wordEnd)
            {
                char  c = (char)(i + 'a');
                String s2 = String.valueOf(c);
                count ++;
                dfs(root.childs[i], len + 1, s + s2);
            }
            
        }
        if(count == 0)
        {
            if(len > maxlen)
            {
                maxlen = len;
                res = s;
                
            }
        }
        
    }
    
    public String longestWord(String[] words)
    {
        TrieNode root = buildTrie(words);
        maxlen = 0;
        res = "";
        String s = new String();
        dfs(root, 0, s);
        //System.out.println(maxlen);
        return res;
    }
}
