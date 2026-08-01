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
    public ListNode oddEvenList(ListNode head) {
        ListNode i = new ListNode(-1);
        ListNode j = new ListNode(-1);
        ListNode prev1 = i;
        ListNode prev2 = j;
        ListNode temp = head;
        int idx = 1;
        if(head==null || head.next==null) return head;
        while(temp!=null){
            if(idx%2!=0){
                i.next = temp;
                i = i.next;
                temp = temp.next;
                i.next = null;
                idx++;
            }
            else{
                j.next = temp;
                j = j.next;
                temp = temp.next;
                j.next = null;
                idx++;
            }
        }
        if(prev1.next==null) return prev2.next;
        if(prev2.next==null) return prev1.next;
        ListNode ans = prev1.next;
        ListNode temp1 = ans;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next = prev2.next;
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna