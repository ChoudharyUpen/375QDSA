class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
      // Creating Three Pointers 1,Slow 2.Fast 3.Prev and intializing them 
        Node slow=head;
        Node fast=head;
        Node prev=null;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            //Moving slow pointer 1 step at a time
            slow=slow.next;
          //Moving fast pointer 2 step at a time
            fast=fast.next.next;

             //if(slow == fast) loop is deteced
            if(slow == fast)
            {
                if(slow==head)// Check if loop starts at the head
                {
                    prev.next=null;// Break the loop
                    return;// Exit the method
                }
              //Now, if we start fast from the head again
                fast=head;
                // and move both slow and fast one step at a time, they will meet at the start of the loop.
                while(fast.next!=slow.next)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                //We then set slow.next = null to break the loop. This action
              // disconnects the loop from the rest of the list by making the node just before the 
              //loop point to null instead of the loop start node.
                slow.next=null;
              //The break statement is used to exit the outer while loop since we have successfully removed the loop.
                break;

            }
        }
        
        return;
        
    }
    
}
