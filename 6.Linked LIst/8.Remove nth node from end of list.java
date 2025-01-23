//this code is easy for this question learn this approach 

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}














//Leetcode
//imporved code keeping in mind time limit /time complexity
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);    ||  ye ek human dummy node banyi
        ListNode dummy = res;                    || ye dummy node ko point kar raha hai

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
