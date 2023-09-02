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
    public ListNode reverseList(ListNode head) {
        // ListNode prev = null;
        // ListNode next = new ListNode();
        // ListNode curr = head; 
        // while(curr!= null)
        // {
        //     next=curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // return prev;
        return recursive(head, null);

    }
    private ListNode recursive(ListNode curr, ListNode prev)
    {
        if(curr == null)
        {
            return prev;
        }
        ListNode next = curr.next;
        curr.next = prev;
        return recursive(next, curr);
    }
}