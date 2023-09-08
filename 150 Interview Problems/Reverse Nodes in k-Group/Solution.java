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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = prev.next;

        int counter = 0;
        while (curr != null) {
            counter++;
            curr = curr.next;
        }

        while (counter >= k) {
            ListNode previous = null;
            ListNode node = prev.next;
            ListNode prevNext = prev.next;

            for (int i = 0; i < k; i++) {
                ListNode next = node.next;
                node.next = previous;
                previous = node;
                node = next;
            }

            prev.next = previous;
            prev = prevNext;
            prev.next = node;
            counter -= k;
        }

        return dummy.next;
    }
}
    