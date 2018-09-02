/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution 
{
    public Node treeToDoublyList(Node root) 
    {
        if(root == null) return root;
        
                
        Node dummy = new Node(0, null, null);
        Node prev = dummy;
        
        Stack<Node> stack = new Stack<Node>();
        Node tmp = root;

        while(!stack.empty() || tmp != null)
        {
            while(tmp != null)
            {
                stack.push(tmp);
                tmp = tmp.left;
            }

            Node curr = stack.pop();
            prev.right = curr;
            curr.left = prev;
            prev = curr;

            tmp = curr.right;
        }
        
        
        dummy.right.left = prev;
        prev.right = dummy.right;
        return dummy.right;
        
        
    }
}