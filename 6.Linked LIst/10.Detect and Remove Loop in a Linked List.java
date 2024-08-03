class Solution
{
    public static void removeLoop(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = null;
        
        while (fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                if (slow == head)
                {
                    prev.next = null;
                    return;
                }
                fast = head;
                while (fast.next != slow.next)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                slow.next = null;
                break;
            }
        }
        
        return;
    }
}    return;
        
    }  
}
