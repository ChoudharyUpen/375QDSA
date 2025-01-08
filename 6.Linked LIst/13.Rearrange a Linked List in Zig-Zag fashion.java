class Solution {
    Node zigZag(Node head) {
        Node temp = head; // for traversing
        int flag = 0;
        while (temp != null && temp.next != null) { // Ensure temp.next is not null
            if (flag == 0) {
                if (temp.data > temp.next.data) {
                    int val = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = val;
                }
                flag = 1;
            } else {
                if (temp.data < temp.next.data) {
                    int val = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = val;
                }
                flag = 0;
            }
            temp = temp.next;
        }
        return head;
    }
}
