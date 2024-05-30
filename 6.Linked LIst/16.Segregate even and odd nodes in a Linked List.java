class Solution{
    Node divide(int N, Node head){
        Node o= new Node(-1);
        Node e= new Node(-1);
        
        Node curr1=o;
        Node curr2=e;
        
        Node pt=head;
        
        while(pt!=null){
            if(pt.data%2==0){
                  curr2.next = pt;
                curr2 = pt;
                
            }
            else{
                  curr1.next = pt;
                curr1 = pt;
                
            }
             pt = pt.next;
            
        }
         curr1.next = null;
        curr2.next = o.next;
        
        head = e.next;
      
        return head;
        
    }
}
