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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode l1 = new ListNode(0);
        l1.next = head;
        ListNode l2 = new ListNode(0);
        l2.next = head;

        for(int i = 0; i < n; i++)
        {
            l1 = l1.next;

        }


        for(int i = 0; ; i++)
        {
            if( l1.next ==null )
            {
                break;
            }
            else
            {
                l1 = l1.next;
                l2 = l2.next;
            }

        }

        ListNode l3 = new ListNode(0);
        l3 = l2.next;
        l2.next = l3.next;

        if(l3 == head) return l3.next;
        else return head;
    }
}
