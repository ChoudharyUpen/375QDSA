public static Node reverseDLL(Node  head)
{
  
    // If the list is empty, return null
    if (head == null) {
        return null;
    }

    Node current = head;  // Start with the head of the list
    Node temp = null;     // Temporary pointer for swapping

    // Traverse the entire list
    while (current != null) {
        // Swap the next and prev pointers of the current node
        temp = current.prev;         // Store the previous pointer
        current.prev = current.next; // Make prev point to next
        current.next = temp;         // Make next point to the original prev (stored in temp)
        
        // Move to the next node in the list (which is current.prev after swapping)
        current = current.prev;
    }

    // After the loop, temp will be on the old head, 
    
    if (temp != null) {
        //so move one step back to get the new head
        head = temp.prev;
    }

    return head; // Return the new head of the reversed list
}
