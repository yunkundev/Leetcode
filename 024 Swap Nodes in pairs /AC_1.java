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
    public ListNode swapPairs(ListNode head)
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ln = dummy;
        ListNode tmp1 = dummy;
        ListNode tmp2 = dummy;
        while(true)
        {
            if(ln.next == null || ln.next.next == null)
            {
                break;
            }
            tmp1 = ln.next;
            tmp2 = ln.next.next;
            tmp1.next = tmp2.next;
            tmp2.next = tmp1;
            ln.next = tmp2;
            ln = ln.next;
            ln = ln.next;

        }
        return dummy.next;
    }
}
