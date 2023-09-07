/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        int interval = 1;
        while(interval<size)
        {
            for(int i=0;i<size-interval;i+=interval*2)
            {
                lists[i] = merge(lists[i], lists[i+interval]);
            }
            interval *=2;
        }
        if(size>0)
            {
                return lists[0];
            }
        else
            {
                return null;
            }

    }
    private ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(l1!=null && l2 !=null)
        {
            if(l1.val<l2.val)
            {
                current.next = new ListNode(l1.val);
                l1=l1.next;
                current  = current.next;
            }
            else{
                current.next =  new ListNode(l2.val);
                l2=l2.next;
                current  = current.next;
            }
        }
        while(l1!=null)
        {
            current.next = new ListNode(l1.val);
            l1=l1.next;
            current  = current.next;
        }
        while(l2!=null)
        {
            current.next =  new ListNode(l2.val);
            l2=l2.next;
            current  = current.next;
        }
        return dummy.next;
    }
}
