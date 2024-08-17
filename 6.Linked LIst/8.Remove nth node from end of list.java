//Leetcode
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
