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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int curr = -1;
        int remaining = 0;
        while(l1!=null && l2 !=null)
        {
            int sum = l1.val+l2.val;
            curr = (remaining + sum)%10;
            remaining = (remaining + sum)/10;
            current.next = new ListNode(curr);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null)
        {
            curr = (remaining + l1.val)%10;
            remaining =(remaining + l1.val)/10;
            current.next = new ListNode(curr);
            current = current.next;
            l1 = l1.next;
        }
        while(l2!=null)
        {
            curr = (remaining + l2.val)%10;
            remaining = (remaining + l2.val)/10;
            current.next = new ListNode(curr);
            current = current.next;
            l2 = l2.next;
        }
        if(remaining!=0)
        {
            current.next = new ListNode(remaining);
        }
        return dummy.next;
    }
}