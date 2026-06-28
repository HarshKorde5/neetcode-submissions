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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int k = lists.length;
        while(true){
            int minNode = -1;

            for(int i = 0; i < k; i++){
                if(lists[i] == null)    continue;

                if(minNode == -1 || lists[i].val < lists[minNode].val){
                    minNode = i;
                }
            }

            if(minNode == -1){
                break;
            }

            curr.next = lists[minNode];
            lists[minNode] = lists[minNode].next;
            curr = curr.next;
    
        }

        return res.next;
    }
}
