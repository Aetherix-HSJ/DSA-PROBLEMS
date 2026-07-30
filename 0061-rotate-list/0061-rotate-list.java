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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        int size = 0; 
        ListNode temp = head;
        if(head==null) return null;

        while(temp!=null){
            size++;
            temp = temp.next;
        }
        k = k% size;
        if(k==0) return head;
        for(int i=0; i<=k; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast= fast.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode temp1 = a;
        while(temp1.next!=null){
            temp1 = temp1.next;
        }
        temp1.next = head;
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna