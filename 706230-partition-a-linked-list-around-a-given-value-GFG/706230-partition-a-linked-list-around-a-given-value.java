/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        Node i = new Node(-1);
        Node j = new Node(-1);
        Node k = new Node(-1);
        Node prev1 = i;
        Node prev2 = j;
        Node prev3 = k;
        Node temp = head;
        if(head==null|| head.next==null) return head;
        while(temp!=null){
            if(temp.data<x){
                i.next = temp;
                i = i.next;
                temp = temp.next;
                i.next = null;
            }
            else if(temp.data>x){
                k.next = temp;
                k = k.next;
                temp = temp.next;
                k.next = null;
            }
            else{
                j.next = temp;
                j  =j.next;
                temp = temp.next;
                j.next = null;
            }
        }
        if(prev1.next==null){
        Node temp1 = prev2.next;
        while(temp1.next!=null){
            temp1 = temp1.next;
        }
        temp1.next = prev3.next;
        return prev2.next;
        }
        
        if(prev2.next==null){
        Node temp1 = prev1.next;
        while(temp1.next!=null){
            temp1 = temp1.next;
        }
        temp1.next = prev3.next;
        return prev1.next;
        }
        
        if(prev3.next==null){
        Node temp1 = prev1.next;
        while(temp1.next!=null){
            temp1 = temp1.next;
        }
        temp1.next = prev2.next;
        return prev1.next;
        }
        
        Node ans = prev1.next;
        Node temp1 = ans;
        while(temp1.next!=null){
            temp1 = temp1.next;
        }
        Node temp2 = prev2.next;
        temp1.next = prev2.next;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = prev3.next;
        return ans;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna