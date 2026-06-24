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
        Map<Node, Node> copyMap = new HashMap<>();
        copyMap.put(null,null);

        Node curr = head;

        while(curr != null){

            if(!copyMap.containsKey(curr)){
                copyMap.put(curr, new Node(0));
            }
            copyMap.get(curr).val = curr.val;

            if(!copyMap.containsKey(curr.next)){
                copyMap.put(curr.next, new Node(0));
            }
            copyMap.get(curr).next = copyMap.get(curr.next);

            if(!copyMap.containsKey(curr.random)){
                copyMap.put(curr.random, new Node(0));
            }
            copyMap.get(curr).random = copyMap.get(curr.random);

            curr = curr.next;
        }

        return copyMap.get(head);
    }
}
