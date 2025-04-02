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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0,head);
        ListNode sP = dummy;
        ListNode fP = dummy;

        for(int i = 0; i<=n; i++){
            fP = fP.next;
        }

        while(fP != null){
            sP = sP.next;
            fP = fP.next;
        }

        sP.next = sP.next.next;

        return dummy.next;
    }
}