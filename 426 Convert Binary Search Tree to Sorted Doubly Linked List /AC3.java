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
    //connect two double linked list
    public Node connect(Node a, Node b)
    {
        if(a==null) return b;
        if(b==null) return a;
        Node al = a.left;
        Node bl = b.left;
        al.right = b;
        b.left = al;
        bl.right = a;
        a.left = bl;
        return a;
    }
    
    
    // return the head of double linked list
    public Node helper(Node node)
    {
        if(node == null) return null;
        
        
        
        Node Left = helper(node.left);
        Node Right = helper(node.right);
        
        System.out.println(node.val);
        
        // use left tree's and right tree's double linked list to generate a new list
        node.right = node;
        node.left = node;
        
        Node res = connect(connect(Left, node), Right);
        //System.out.println(res.val);
        
        return res;
    }
    
    public Node treeToDoublyList(Node root)
    {
        if(root == null) return root;
        return helper(root);
    }
}