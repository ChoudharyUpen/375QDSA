class Solution {
    public static void removeLoop(Node head) {
        Node prev = null;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected
                if (slow == head) {
                    // Edge Case: If the loop is at the head
                    while (prev.next != head) {
                        prev = prev.next;
                    }
                    prev.next = null;
                    return;
                }
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    prev = slow;
                    slow = slow.next;
                }
                prev.next = null;
                return;
            }
        }
    }
}
