class Solution
{
    Node reverse(Node head)
    {
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=null;
        while(head!=null)
        {
            Node next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }
    
    Node compute(Node head)
    {
        head=reverse(head);
        Node curr=head;
        int max=head.data;
        Node prev=head;
        head=head.next;
        
        while(head!=null){
            if(head.data>=max)
            {
                max=head.data;
                prev=head;
                head=head.next;
            }
            else{
                prev.next=head.next;
                head=prev.next;
            }
        }
        return reverse(curr);
        
    }
}
