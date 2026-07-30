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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i =list1;
        ListNode j = list2; 
        ListNode k = new ListNode(-1);
        ListNode ans = k;
        while(i!=null && j!=null){
            if(i.val<j.val){
                 k.next = i;
                 i = i.next; 
                 k = k.next;
            }
            else if(i.val>j.val){
                k.next = j;
                j = j.next; 
                k = k.next;
            }
            else{
                k.next = i;
                k = k.next;
                i= i.next;
                k.next = j;
                k = k.next;
                j = j.next;
            }
        }
        if(i==null) k.next = j;
        else if(j==null) k.next = i;
        return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna