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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack();
        ListNode temp = head;
        while(temp!=null){
            while(st.size()>0 && temp.val>st.peek().val){
                st.pop();
            }
           st.push(temp);
           temp = temp.next;
        }
        while(st.size()>0){
           ListNode top = st.pop();
           top.next = temp;
           temp = top;
        } 
        return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna