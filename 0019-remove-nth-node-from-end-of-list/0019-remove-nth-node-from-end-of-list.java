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
      ListNode temp = head;
      int size=1;
      if(head.next==null && n==1) return null;
      if(head.next.next==null && n==1) {
        head.next=null;
        return head;
      } 
      if(head.next.next==null && n==2){
        head = head.next;
        return head;
      }
      while(temp.next!=null){
         size++;
         temp = temp.next;
      }
      temp = head;
      if(n==size){
        head = head.next;
        return head;
      }
      for(int i=0; i<size-n-1; i++){
         temp = temp.next;
      }
      temp.next = temp.next.next;
      return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna