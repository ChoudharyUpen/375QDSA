Reverse a Linked List ------------
(we use three pointer in this we can also this of a boat example in 
which only middle one is doing something and rest all are moving)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(current!=null){
            ListNode temp= current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }
}
