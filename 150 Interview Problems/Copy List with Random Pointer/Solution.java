/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node dummy = new Node(Integer.MIN_VALUE);
        Node curr = dummy;
        Node copy = head;
        while(copy !=null)
        {
            curr.next = new Node(copy.val);
            curr = curr.next;
            map.put(copy, curr);
            copy = copy.next;
        }
        curr = dummy.next;
        while(head!=null)
        {
            curr.random = map.get(head.random);
            head = head.next;
            curr = curr.next;

        }
        return dummy.next;


    }
}