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
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode i = new ListNode(-1);
        ListNode j = new ListNode(-1);

        ListNode prev1 = i;
        ListNode prev2 = j;

        ListNode temp = head;
        int idx = 1;

        
        while (temp != null) {
            if (idx % 2 != 0) {
                i.next = temp;
                i = i.next;
            } else {
                j.next = temp;
                j = j.next;
            }

            temp = temp.next;

            if (idx % 2 != 0)
                i.next = null;
            else
                j.next = null;

            idx++;
        }

        ListNode head1 = prev1.next; 
        ListNode head2 = prev2.next; 

        ListNode ans = new ListNode(-1);
        ListNode tail = ans;

       
        while (head1 != null && head2 != null) {

            ListNode nextEven = head2.next;
            ListNode nextOdd = head1.next;

            tail.next = head2;
            tail = tail.next;

            tail.next = head1;
            tail = tail.next;

            head2 = nextEven;
            head1 = nextOdd;
        }

        
        if (head1 != null)
            tail.next = head1;

        return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna