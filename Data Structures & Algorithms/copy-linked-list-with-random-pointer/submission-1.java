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

        if(head == null)    return null;
        Node oldHead = head;

        while(oldHead != null){
            Node newnode = new Node(oldHead.val);
            newnode.next = oldHead.next;
            oldHead.next = newnode;

            oldHead = newnode.next;
        }

        Node newHead = head.next;
        oldHead = head;

        while(oldHead != null){

            if(oldHead.random != null){
                oldHead.next.random = oldHead.random.next;
            }

            oldHead = oldHead.next.next;
        }


        oldHead = head;
        while(oldHead != null){
            Node temp = oldHead.next;
            oldHead.next = temp.next;

            if(temp.next != null){
                temp.next = temp.next.next;
            }

            oldHead = oldHead.next;
        }

        return newHead;
    }
}
