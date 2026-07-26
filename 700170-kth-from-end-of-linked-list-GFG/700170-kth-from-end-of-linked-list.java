/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=k; i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna