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
    public ListNode removeNodes(ListNode head) {
        ListNode revHead = rev(head);
        ListNode i = revHead;
        ListNode j = revHead.next;
        while (j != null) {
            if (j.val >= i.val) {
               i.next = j;
               i = j;
            }
        
            j = j.next;
            
        }
         i.next = null;
        return rev(revHead);
    }

    public ListNode rev(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna