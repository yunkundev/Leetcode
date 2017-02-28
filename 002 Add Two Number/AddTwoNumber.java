/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int f = 0;
        ListNode l3 = new ListNode(0);
        ListNode ll = new ListNode(0);
        l3.next = ll;
        while( (l1 != null) || (l2 != null) )
        {
            int v1,v2,sum;
            if(l1 == null)  v1 = 0;
            else {v1 = l1.val; l1 = l1.next;}
            if(l2 == null)  v2 = 0;
            else {v2 = l2.val; l2 = l2.next;}
            // calculate sum
            sum = (v1 + v2 + f) % 10 ;
            // carry bit
            f = (v1 + v2 +f)/10;
            ListNode ln = new ListNode(sum);
            ln.next = null;
            ll.next = ln;
            ll = ln;
        }
        // the last carry
        if(f == 1)
        {
            ListNode lc = new ListNode(1);
            lc.next = null;
            ll.next = lc;
        }
        return l3.next.next;


    }
}
