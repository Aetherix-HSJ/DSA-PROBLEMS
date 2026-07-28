/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode temp1 = headA;
       ListNode temp2 = headB;
       int size1 = 1;
       int size2 = 1;
       if(headA==null || headB==null) return null; 
       while(temp1.next!=null){
        size1++;
        temp1 = temp1.next;
       } 
       while(temp2.next!=null){
        size2++;
        temp2 = temp2.next;
       }
       temp1 = headA;
       temp2 = headB;
       int n = 0;
       if(size1-size2>0){ 
        n = size1-size2;
        for(int i=0; i<n;i++){
            temp1 = temp1.next;
        }
       }
       else if(size2-size1>0){
         n = size2-size1;
         for(int i=0; i<n; i++){
            temp2 = temp2.next;
         }
       }
       while(temp1!=null && temp2!=null){
        if(temp1==temp2) return temp1;
        temp1 = temp1.next;
        temp2 = temp2.next;
       }
       return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna