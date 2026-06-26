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

        ListNode head = l1;

        int carry = 0;

        while(l1 != null && l2 != null){
            int sum = l1.val +  l2.val + carry;

            carry = sum / 10;

            l1.val = sum % 10;

            l1 = l1.next;
            l2 = l2.next;

        }

        while(l1 != null){
            int sum = l1.val + carry;

            carry = sum / 10;
            l1.val = sum % 10;

            l1 = l1.next;
        }

        l1 = head;
        while(l1.next != null){
            l1 = l1.next;
        }

        while(l2 != null){
            ListNode newn = new ListNode();
            int sum = l2.val + carry;

            carry = sum / 10;

            newn.val = sum % 10;
            l1.next = newn;
            l1 = newn;

            l2 = l2.next;
        }

        if(carry != 0){
            ListNode newn = new ListNode(carry);
            l1.next = newn;
        }
        return head;

    }
}
