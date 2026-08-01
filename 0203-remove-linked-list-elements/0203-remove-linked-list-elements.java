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
    public ListNode removeElements(ListNode head, int val) {
        ListNode i = new ListNode(-1);
        ListNode j = new ListNode(-1);
        ListNode ans = j;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val==val){
                i.next = temp;
                i = i.next;
                temp = temp.next;
                i.next = null;
            }
            else{
                j.next = temp;
                j = j.next;
                temp = temp.next;
                j.next = null;
            }
        }
        return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna