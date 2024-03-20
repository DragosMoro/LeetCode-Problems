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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int current = 0;
        ListNode res = list1;
        int list2Len = 0;
        while(current<a-1)
        {
            list1 = list1.next;
            current++;
        }
        if(current == a-1)
            {
               ListNode next = list1.next;
               for(int i=0;i<b-a;i++)
               {
                    next = next.next;
               }
               ListNode last = next.next;
               next.next=null;
               list1.next = list2;
               while(list2.next!=null)
               {
                list2 = list2.next;
               }
               list2.next = last;
            }
        return res;
    }
}