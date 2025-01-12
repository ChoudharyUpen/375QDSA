//this is the more better solution than down 2 codes
Input DLL: 1 <-> 2 <-> 3

Step-by-Step Execution:
Iteration	Node (node)	Temp (temp)	Ans (ans)	Reversed DLL
1st	            1	          2	          1	     1 (prev set to null)
2nd	            2	          3	          2	     2 <-> 1
3rd	            3	          null	      3	     3 <-> 2 <-> 1
    
Return Value: ans = 3


class Solution{
public DLLNode reverseDLL(DLLNode head) {
    DLLNode node = head;
    DLLNode temp = null, ans = null;

    while (node != null) {
        temp = node.next; // Save the next node
        node.next = node.prev; // Reverse the next pointer
        node.prev = temp; // Reverse the prev pointer

        //it is going to store node value which is going to be 
        //normal traversal --- 1,2,3 at last it will contains 3
        ans = node; // Update the new head to the current node
        //temp store next pointer ---- for 1,2,3 it will contains 2,3 
        node = temp; // Move to the next node
    }

    return ans; // Return the new head of the reversed DLL
}}









//this code is better than code below it 
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode node = head;
        DLLNode temp = null,ans=null;
        
        while(node!=null) {
            temp = node.next;
            node.next = node.prev;
            node.prev = temp;
            
            if(temp != null) ans = temp.prev;
            node = temp;
        }
        return ans!=null?ans.prev:head; 
    }
}




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
