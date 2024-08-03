class Solution {
    Node divide(int N, Node head) {
        // Dummy nodes create kar rahe hain
        Node o = new Node(-1);
        Node e = new Node(-1);
        
        // Odd aur even list ke current pointers
        Node curr1 = o;
        Node curr2 = e;
        
        // Original list traverse karne ke liye pointer
        Node pt = head;
        
        // Original list ko traverse karte hain
        while (pt != null) {
            if (pt.data % 2 == 0) {
                // Agar even data hai toh even list mein add karo
                curr2.next = pt;
                curr2 = pt;
            } else {
                // Agar odd data hai toh odd list mein add karo
                curr1.next = pt;
                curr1 = pt;
            }
            // Next node par move karo
            pt = pt.next;
        }
        
        // Odd list ko terminate karo
        curr1.next = null;
        // Even list ke end ko odd list ke start se link karo
        curr2.next = o.next;
        
        // Naya head set karo even list ka start
        head = e.next;
        
        // Modified list ka head return karo
        return head;
    }
}
