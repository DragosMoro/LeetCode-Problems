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
    public ListNode middleNode(ListNode head) {
        ListNode node= head;
        int len = 0;
        while(node!=null)
        {
            node = node.next;
            len++;
        }
        int mid = 0;
        mid=len/2;
        int i=0;
        ListNode res = head;
        while(i<mid)
        {
            res = res.next;
            i++;
        }
        return res;
    }
}