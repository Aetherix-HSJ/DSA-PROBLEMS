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
    public ListNode partition(ListNode head, int x) {
        ListNode i = new ListNode(-1);
        ListNode j = new ListNode(-2);
        ListNode prev1 = i;
        ListNode prev2 = j;
        ListNode temp = head;
        if(head==null) return null;
        while(temp!=null){
            if(temp.val>=x) {
                j.next = temp;
                j = j.next;
                temp = temp.next;
                j.next = null;
            }
            else {
                i.next = temp;
                i = i.next;
                temp = temp.next;
                i.next = null;
            }
        }
        if(prev1.next==null) return prev2.next;
        if(prev2.next==null) return prev1.next;
        ListNode ans = prev1.next;
        ListNode k = ans;
        while(k.next!=null){
            k = k.next;
        }
        k.next = prev2.next;
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna