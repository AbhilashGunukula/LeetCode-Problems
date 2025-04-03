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
    public ListNode reverseBetween(ListNode head, int left, int right) {


        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prePointer = dummy;

        for(int i =0; i<left-1; i++){
            prePointer = prePointer.next;
        }

        ListNode currPointer  = prePointer.next;

        for(int i = left; i<right; i++){
            ListNode forward = currPointer.next;
            currPointer.next = forward.next;
            forward.next = prePointer.next;
            prePointer.next = forward;
        }

        return dummy.next;

        
    }
}