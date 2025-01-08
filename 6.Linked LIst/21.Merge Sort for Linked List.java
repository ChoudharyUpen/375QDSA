//Recursion is ued in it 
class Solution {

    static Node merge(Node t1, Node t2) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                current.next = t1;
                t1 = t1.next;
            } else {
                current.next = t2;
                t2 = t2.next;
            }
            current = current.next;
        }

        if (t1 != null) {
            current.next = t1;
        } else {
            current.next = t2;
        }

        return dummy.next;
    }

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(slow);

        return merge(left, right);
    }
}
