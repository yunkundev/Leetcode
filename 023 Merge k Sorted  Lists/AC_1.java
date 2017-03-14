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
    public ListNode mergeKLists(ListNode[] lists)
    {
        int n = lists.length;
        int val1 = 0,val2 = 0, ind = 0, val = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            if(lists[i] != null)
            {
                val1 = lists[i].val;
                if(map.containsKey(val1))
                {
                    al = map.get(val1);
                    al.add(i);
                    map.put( val1, al);
                }
                else
                {
                    al = new ArrayList<Integer>();
                    al.add(i);
                    map.put( val1, al);
                }

            }

        }

        PriorityQueue<Integer>PQ = new PriorityQueue<Integer>();
        for(int i = 0; i < n; i++)
        {
            if(lists[i] != null)
            {

                PQ.add( lists[i].val );
                //System.out.println(lists[i].val);
            }


        }

        ListNode dummy = new ListNode(-1);
        ListNode list = dummy;
        while(true)
        {
            if(PQ.size() == 0)
            {
                break;
            }
            val = PQ.poll();
            ListNode ln = new ListNode(val);
            ln.next = null;
            list.next = ln;
            list = ln;


            al = map.remove(val);
            ind = al.remove(0);
            if(!al.isEmpty()) map.put( val, al);


            lists[ind] = lists[ind].next;

            if(lists[ind] != null)
            {
                val2 = lists[ind].val;
                if(map.containsKey(val2))
                {
                    al = map.get(val2);
                    al.add(ind);
                    map.put( val2, al);
                }
                else
                {
                    al = new ArrayList<Integer>();
                    al.add(ind);
                    map.put( val2, al);
                }
                PQ.add(lists[ind].val);
            }
        }
        return dummy.next;

    }
}
