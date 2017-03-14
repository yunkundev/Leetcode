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
    public ListNode reverseKGroup(ListNode head, int k)
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ln = dummy;
        ListNode tmp1 = dummy;
        ListNode tmp2 = dummy;
        ListNode tmp3 = dummy;
        ListNode tmp4 = dummy;
        if(k == 1) return dummy.next;
        else if(k == 2)
        {
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
        while(true)
        {
            tmp3 = ln;
            for(int i = 0; i < k; i++)
            {
                tmp3 = tmp3.next;
                if(tmp3 == null) return dummy.next;
            }
            tmp4 = tmp3.next;

            //System.out.println(tmp4.val);
            //System.out.println(tmp3.val);
            tmp1 = ln.next;
            ln.next = tmp3;
            tmp2 = tmp1.next;
            tmp1.next = tmp4;
            ln = tmp1;
            //System.out.println(dummy.next.val);
            for(int i = 0; i< k-1; i++)
            {
                tmp3 = tmp2.next;
                tmp2.next = tmp1;
                //System.out.println(tmp2.val+" "+tmp1.val);
                tmp1 = tmp2;
                tmp2 = tmp3;

            }


        }
    }
}
