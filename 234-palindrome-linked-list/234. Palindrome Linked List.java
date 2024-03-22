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
    public boolean isPalindrome(ListNode head) {
        ListNode lenHead = head;
        int len=0;
        while(lenHead!=null)
        {
            lenHead = lenHead.next;
            len++;
        }
        int mid = len / 2;
        ListNode copy = head;
        ListNode prev = null;

        for(int i = 0; i < mid; i++) {
            ListNode aux = copy.next;
            copy.next = prev;
            prev = copy;
            copy = aux;
        }

        if(len % 2 != 0) {
            copy = copy.next;
        }

        while(copy!=null && prev!=null)
        {
            if(copy.val != prev.val)
            {
                return false;
            }
            copy=copy.next;
            prev=prev.next;
        }
        return true;
      
    }
}