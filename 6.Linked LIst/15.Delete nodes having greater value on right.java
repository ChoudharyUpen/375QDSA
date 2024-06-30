class Solution{
    Node compute(Node head){
        Node newnode = new Node(0);
        Node again = newnode;
        Node curr = head;
        while(curr!=null){
            if(!checkIf(curr)){
                again.next = curr;
                again = again.next; 
            }
            curr = curr.next;
        }
        return newnode.next;    
    }
    boolean checkIf(Node cur){
        Node prev  = cur;
        while(cur!=null){
            if(prev.data<cur.data){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }}
