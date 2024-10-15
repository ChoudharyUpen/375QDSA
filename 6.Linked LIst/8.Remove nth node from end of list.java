  //Leetcode
//imporved code keeping in mind time limit /time complexity
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return res.next;        
    }
}















//This code is giving time limit exceed error
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp=head;
        int count=0;
        while(tmp!=null){
            count++;
            tmp=tmp.next;
        }
        int steps=count-n;

        if(steps==0){
            return head.next;
        }
        tmp=head;
        for(int i=1;i<steps;i++){
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;

        return head;

    }
}
