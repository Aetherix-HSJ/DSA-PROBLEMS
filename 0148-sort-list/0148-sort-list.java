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
    public ListNode sortList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // ListNode slower = head;
        // if(head==0) return null;
        if(head==null || head.next==null) return head;
        while(fast.next!=null && fast.next.next!=null){
            // slower = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head= sortList(head);
        head2 = sortList(head2);
        return merge(head,head2);
    }
    static ListNode merge(ListNode head,ListNode head2){
        ListNode k = new ListNode(-1);
        ListNode ans = k;
        ListNode i = head;
        ListNode j = head2;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next = i;
                i = i.next;
                k = k.next;
            }
            else if(i.val>j.val){
                k.next = j;
                j = j.next;
                k = k.next;
            }
        }
        if(i==null) k.next = j;
        if(j==null) k.next = i;
         return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna