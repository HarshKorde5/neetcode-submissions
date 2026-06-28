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
        int k = lists.length;

        if(k == 0)  return null;

        for(int i = 1; i < k; i++){
            lists[i] = merge(lists[i], lists[i - 1]);
        }

        return lists[k - 1];
    }

    private ListNode merge(ListNode A, ListNode B){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(A != null && B != null){
            if(A.val < B.val){
                curr.next = A;
                A = A.next;
            }else{
                curr.next = B;
                B = B.next;
            }

            curr = curr.next;
        }

        if(A != null)   curr.next = A;
        else    curr.next = B;

        return dummy.next;
    }
}
