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
    public int pairSum(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while(fast.next!=null && fast.next.next!=null){
        slow = slow.next;
        fast = fast.next.next;
      }  
      ListNode head1 = slow.next;
      slow.next = null;
      ListNode prev = null;
      ListNode curr = head1;
      ListNode fwd = null;
      while(curr!=null){
        fwd = curr.next;
        curr.next = prev;
        prev = curr;
        curr = fwd;
      }
      ListNode i = head;
      ListNode j = prev;
      int sum = 0;
      while(i!=null && j!=null){
         int msum = i.val+j.val;
         if(msum>sum) sum = msum;
         i = i.next; 
         j = j.next;
      }
      return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna