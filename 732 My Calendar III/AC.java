class MyCalendarThree 
{
    static class segmentTree
    {
        int start;
        int end;
        segmentTree left;
        segmentTree right;
        int count;
        segmentTree(int s, int e, int c)
        {
            start = s;
            end = e;
            left = null;
            right = null;
            count = c;
        }
    }

    segmentTree root;
    int res;
    public MyCalendarThree() 
    {
        root = null;
        res = 0;
    }
    
    
    public segmentTree insert(segmentTree root, int s, int e, int c)
    {
        if(root == null)
        {
            
            segmentTree node = new segmentTree(s, e, c);
            if(c > res) res = c;
            return node;
        }
        if( s >= root.end ) root.right = insert(root.right, s, e, c);
        else if(e <= root.start) root.left = insert(root.left, s, e, c);
        else
        {
            int min = Math.max(root.start, s);
            int max = Math.min(root.end, e);
            //System.out.println(min +" "+ max+" "+s +" "+e+" "+root.start+" "+root.end);
            
            if(s < min)    root.left = insert(root.left, s, min, c);
            else if(root.start < min) root.left = insert(root.left, root.start, min, root.count);
            if(e > max) root.right = insert(root.right, max, e, c);
            else if(root.end > max) root.right = insert(root.right, max, root.end, root.count);
            
            root.start = min;
            root.end = max;
            root.count = root.count + c;
            if(root.count > res) res = root.count;
        }
        return root;
    }
    
    
    public void printTree(segmentTree root)
    {
        if(root == null) return;
        System.out.println(root.start + " "+ root.end + " " + root.count);
        printTree(root.left);
        printTree(root.right);
    }
    
    public int book(int start, int end) 
    {
        root = insert(root, start, end, 1);
        //printTree(root);
        //System.out.println("=====");
        return res;
    }
}