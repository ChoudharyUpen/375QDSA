Basicaly this question can be done in 3 steps
1. Find Mid
2. Reverse Second Half after detaching
3. Insert 2nd list into 1st
Step 4 is most important understand that

class Solution {
    public void reorderList(ListNode head) {
        //if list is empty
        if(head==null || head.next==null ||head.next.next==null)  {
            return;

        }
        //Step1
        //find the middle
        //2 Pointer
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;    
        }
        //Step2
        ListNode secondHead =slow.next;
        //detach the two LL
        slow.next=null;

        //Step3 
        //reverse the second LL
        ListNode cur=secondHead;
        ListNode prev=null;
        while(cur!=null){
           ListNode nextNode = cur.next;
           cur.next=prev;
           prev=cur;
           cur=nextNode; 
        }

        //Step4
      Step 4 is most important understand that
        //insert nodes of second list into first list
        ListNode t1=head;
        ListNode t2=prev;
        while(t2!=null){
            //Agla node lost na hoja is liye
            ListNode m1=t1.next;
            ListNode m2=t2.next;
            t1.next=t2;
            t2.next=m1;
            t1=m1;
            t2=m2;
        }

    }
}
