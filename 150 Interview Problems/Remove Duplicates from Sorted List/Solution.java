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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(-101);
        res.next = head;
        ListNode prev = res;
        while(head!=null)
        {
            if(prev.val == head.val)
            {
                prev.next = head.next;
            }
            else{
                prev = head;
            }
            head=head.next;
        }
        return res.next;
    }
}