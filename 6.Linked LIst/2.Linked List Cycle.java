Linked List Cycle ---------

((i)Floyd's Cycle Detection Algorithm use slow and fast pointer where 
slow and fast pointer meet)

((ii)we were using hashing or hashmap also but time complexity and 
space complexity is O(N))



public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true; //returning slow if we also want to detectfirstnode
            }
            
        }return false;
        
    }
}
((iii)question can also be from which place cycle is starting)
// Step 2: If loop is detected, find the start of the loop
    // The line if (slow == fast) { is used 
    // to check whether the slow and fast pointers have met at some point in the linked list.
        if (slow == fast) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow; // Starting node of the loop
        }

        
((iv)question can also be linked has cycle usko delete bhi kar ka dikho)


learned topics ---
A linked list can be reversed either iteratively or recursively

Iteratively --- using loop 
Recursively --- using recursion

thank you❤️
----------------------------------------------------------------------------------
