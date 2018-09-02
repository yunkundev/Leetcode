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
c<p></p>lass Solution 
{
    Node prev;
    Node last;
    Node head;
    
    public Node findLastNode(Node node)
    {
        while(node.right != null)
        {
            node = node.right;
        }
        return node;
    }
    
    public Node findFirstNode(Node node)
    {
        while(node.left != null)
        {
            node = node.left;
        }
        return node;
    }
    
    
    public void inOrder(Node node)
    {
        if(node == null) return;
        if(node == head && node.left == last)
        {
            return;
        }
        
        inOrder(node.left);
        
        //System.out.println(node.val);
        Node RightNode = node.right;
        //point the prev's right to tmp
        //point the tmp's left to prev
        prev.right = node;
        node.left = prev;
        prev = node;
        
        
        
        inOrder(RightNode);
    }
    
    
    
    public Node treeToDoublyList(Node root) 
    {
        if(root == null)
        {
            return root;
        }
        
        
        //Find the last node in BST
        last = findLastNode(root);
        prev = last;
        
        //Ensure the "head" node in Double Linked List
        head = findFirstNode(root);
            
        //Inorder
        inOrder(root);
        
        return head; 
    }

}