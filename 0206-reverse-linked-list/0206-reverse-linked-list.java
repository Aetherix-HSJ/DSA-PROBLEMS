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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ArrayList<ListNode> arr = new ArrayList<>();
        if(head==null) return null;
        while(temp!=null){
              arr.add(temp);
              temp = temp.next;
        }
        int n = arr.size();
        for(int i=n-1; i>=1; i--){
            arr.get(i).next = arr.get(i-1);
        }
        arr.get(0).next = null;
        return arr.get(n-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna