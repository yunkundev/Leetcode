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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode l3 = new ListNode(0);
        l3.next = null;
        ListNode head = l3;
        while(true)
        {
            if( l1 == null )
            {
                l3.next = l2;
                break;
            }
            if( l2 == null)
            {
                l3.next = l1;
                break;
            }
            if(l1.val <= l2.val)
            {
                ListNode ln = new ListNode(l1.val);
                l3.next = ln;
                ln.next = null;
                l3 = ln;
                l1 = l1.next;

            }
            else
            {
                ListNode ln = new ListNode(l2.val);
                l3.next = ln;
                ln.next = null;
                l3 = ln;
                l2 = l2.next;


            }

        }
        return head.next;
    }
}
