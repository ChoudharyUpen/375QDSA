//this is the more better code for this question compare to code given below 

// Step-by-Step Explanation
// Ek ArrayList me saare elements store kar lo.
// ArrayList ko sort kar lo using Collections.sort().
// Sorted values wapas Linked List me daal do.



class Solution {
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        // add your code here
        Node cur=head;
        ArrayList<Integer>li=new ArrayList<>();
        while(cur!=null){
            li.add(cur.data);
            cur=cur.next;
        }
        Collections.sort(li);
        cur=head;
        int i=0;
        while(cur!=null){
            cur.data=li.get(i++);
            cur=cur.next;
        }
        return head;
    }
}























//Recursion is ued in it 
class Solution {

    static Node merge(Node t1, Node t2) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                current.next = t1;
                t1 = t1.next;
            } else {
                current.next = t2;
                t2 = t2.next;
            }
            current = current.next;
        }

        if (t1 != null) {
            current.next = t1;
        } else {
            current.next = t2;
        }

        return dummy.next;
    }

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(slow);

        return merge(left, right);
    }
}
