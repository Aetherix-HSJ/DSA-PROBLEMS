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
    public ListNode deleteMiddle(ListNode head) {
        int size = 1;
        ListNode temp = head;
        while(temp.next!=null){
            size++;
            temp = temp.next;
        }
        if(size==1) return null;
        if(size==2){
            head.next=null;
            return head;
        }
        int middle = (int)size/2;
        temp = head;
        for(int i=0; i<middle-1; i++){
            temp = temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna