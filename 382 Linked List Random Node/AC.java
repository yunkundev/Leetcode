/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution
{
    ListNode h = new ListNode(0);
    
    /** @param head The linked list's head.
     Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head)
    {
        h = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom()
    {
        ListNode node = h;
        int index = 0;
        int tmp = 0;
        Random rdm = new Random();
        while(node != null)
        {
            index ++;
            if(rdm.nextInt(index) == 0)
            {
                tmp = node.val;
            }
            node = node.next;
            
        }
        return tmp;
    }
}
