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
    public boolean isPalindrome(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }
       ListNode prev = null;
       ListNode curr = slow;
       while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       if (fast != null) {
            slow = slow.next;
        }
       ListNode n1 = head;
       ListNode n2 = prev;
       while(n1!=null && n2!=null){
         if(n1.val!=n2.val) return false;
         n1 = n1.next;
         n2 = n2.next;
       }
       return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna