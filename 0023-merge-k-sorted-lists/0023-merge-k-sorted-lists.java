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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n==0) return null;
        if(n==1) return lists[0];
        ListNode head1 = lists[lists.length-1];
        ListNode head2 = lists[lists.length-2];
        ListNode i = head1;
        ListNode j = head2;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(i!=null && j!=null){
            if(i.val<=j.val){
             temp.next = i;
             i = i.next;
             temp = temp.next;
            }
            else{
                temp.next = j;
                j = j.next;
                temp = temp.next;
            }
        }
        if(j==null) temp.next = i;
        if(i==null) temp.next = j;
        ListNode[] newLists = new ListNode[n - 1];
        for (int k = 0; k < n - 2; k++) {
        newLists[k] = lists[k];
         }

        newLists[n - 2] = ans.next;
        return mergeKLists(newLists);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna