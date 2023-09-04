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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode rev = reverse(head);
        int counter = 1;
        ListNode smth = new ListNode(-1);
        smth.next = rev;
        ListNode prev = smth;
        while(rev!=null)
        {
            if(n == counter)
            {
                prev.next = rev.next;
            }
            else{
                prev = rev;
            }
            rev = rev.next;
            counter++;
        }
        ListNode res = reverse(smth.next);
        return res;
    }
    private ListNode reverse(ListNode node)
    {
        ListNode prev = null;
        while(node!=null)
        {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}