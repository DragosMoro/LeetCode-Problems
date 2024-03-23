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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(mid!=null)
        {
            ListNode next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        while(prev !=null)
        {
            ListNode next = head.next;
            ListNode next2 = prev.next;
            head.next = prev;
            prev.next = next;
            head = next;
            prev = next2;
        }

    }
}