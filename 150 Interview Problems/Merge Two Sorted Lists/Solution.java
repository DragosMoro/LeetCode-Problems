class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
  }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
    ListNode prehead = new ListNode(-1);
    ListNode cur = prehead;

