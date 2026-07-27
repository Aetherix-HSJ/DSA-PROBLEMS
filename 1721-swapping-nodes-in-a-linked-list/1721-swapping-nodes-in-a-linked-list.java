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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size = 1;
        while(temp.next!=null){
            size++;
            temp = temp.next;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i=1; i<k;i++){
            temp1=temp1.next;
        }
        for(int i=0; i<size-k; i++){
            temp2 = temp2.next;
        }
        int a= temp1.val; 
        temp1.val = temp2.val;
        temp2.val = a;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna