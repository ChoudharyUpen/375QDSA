class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        if(head == null || head.next == null){
            return head;
        }
        DLLNode prev = null;
        DLLNode temp = head;
        while(temp != null){
        prev = temp.prev;            // Current node ka prev store kar lo
        temp.prev = temp.next;       // Prev ko next banado
        temp.next = prev;            // Next ko prev banado
        temp = temp.prev;            // Ab temp ko aage badhao (jo pehle ka prev tha)

        }
        //bas ye line important hai ye yaad rakhni hai
        return prev.prev;
    }
}



































//gfgf
//more better solution downside of this
//nimisha rawat
// public static Node reverseDLL(Node  head)
// {
  
//     // If the list is empty, return null
//     if (head == null) {
//         return null;
//     }

//     Node current = head;  // Start with the head of the list
//     Node temp = null;     // Temporary pointer for swapping

//     // Traverse the entire list
//     while (current != null) {
//         // Swap the next and prev pointers of the current node
//         temp = current.prev;         // Store the previous pointer
//         current.prev = current.next; // Make prev point to next
//         current.next = temp;         // Make next point to the original prev (stored in temp)
        
//         // Move to the next node in the list (which is current.prev after swapping)
//         current = current.prev;
//     }

//     // After the loop, temp will be on the old head, 
    
//     if (temp != null) {
//         //so move one step back to get the new head
//         head = temp.prev;
//     }

//     return head; // Return the new head of the reversed list
// }


// //more better solution
// public static Node reverseDLL(Node  head)
// {
//     Node temp = head, last = null;
    
//     if(head == null || head.next == null) return head;
    
//     while(temp != null){
//         last = temp.prev;
//         temp.prev = temp.next;
//         temp.next = last;
        
//         temp = temp.prev;
//     }
// //     The loop ends because temp is null
// // last points to C
// // last.prev is D, which is the new head of the reversed list
//     return last.prev;
// }
