/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        HashMap<Node,Integer> map = new HashMap<>();
        Node temp = head;
        int size = 0;
        int idx = 0;
        temp = head;
        while(temp!=null){
            if(map.containsKey(temp)) {
                int a = map.get(temp);
                return size-a;
            }
            else{
                map.put(temp,idx);
                idx++;
                size++;
            }
            temp = temp.next;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna