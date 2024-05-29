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
Node detectFirstNode(Node head){
   Node meet= detectCycle(head);
   Node start = head;
   While(start!=meet){
     start=start.next;
     meet=meet.next;
   }
   return start;
}
((iv)question can also be linked has cycle usko delete bhi kar ka dikho)


learned topics ---
A linked list can be reversed either iteratively or recursively

Iteratively --- using loop 
Recursively --- using recursion

thank you❤️
----------------------------------------------------------------------------------
