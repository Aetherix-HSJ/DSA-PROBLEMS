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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(-1);
        ListNode i = head;
        ListNode dummy = temp;
        while(i!=null && i.next!=null){
           if(i.next==null||i.val!=i.next.val){
            dummy.next = i;
            dummy =  i;
            i = i.next;
           }
           else {
            ListNode j = i.next;
            while(j!=null && j.val==i.next.val){
             j = j.next;
            }
            i = j;
           }
        }
         dummy.next = i;
        return temp.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna