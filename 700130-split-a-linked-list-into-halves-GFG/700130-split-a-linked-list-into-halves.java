class Solution {
    public Pair<Node, Node> splitList(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != head && fast.next != head) {
            slow = slow.next;
            fast = fast.next;

            if (fast.next!= head) {
                fast = fast.next;
            }
        }

        Node head2 = slow.next;

        fast.next = head2;
        slow.next = head;

        return new Pair<>(head, head2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna