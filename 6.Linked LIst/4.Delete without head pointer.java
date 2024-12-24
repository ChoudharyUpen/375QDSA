// Function to delete a node without any reference to head pointer.
class Solution {
    void deleteNode(Node node) {
       node.data = node.next.data;
       node.next = node.next.next;
    }
}
