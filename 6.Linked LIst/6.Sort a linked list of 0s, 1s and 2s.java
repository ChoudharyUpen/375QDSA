class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        //Step1 Initalizing three pointer for stroing 0,1,2
        //and initailzing them with -1.
        Node zeroHead=new Node(-1);
        //Step2 Initalizing tail of these pointer to head intiali
        Node zeroTail=zeroHead;
        Node oneHead=new Node(-1);
        Node oneTail=oneHead;
        Node twoHead=new Node(-1);
        Node twoTail=twoHead;
        
        //Step4 Creating temp for traversing our original Linked List
        //And Starting temp from the location of head
        Node temp=head;
        while(temp!=null){
            //Step5 Storing Temps Next so that it doesnot get Lost
            Node nextNode=temp.next;
            
            //Step5 Now we will do swapping work
            if(temp.data==0){
                //Step6 Free The Temp From The Above List
                temp.next=null;
                zeroTail.next=temp;
                //Step7 Setting tail at last of zero ll
                zeroTail=zeroTail.next;
            }
            else if(temp.data==1){
                temp.next=null;
                oneTail.next=temp;
                oneTail=oneTail.next;
            }
            else{
                temp.next=null;
                twoTail.next=temp;
                twoTail=twoTail.next;
            }
            //Step8 Changing the postiuon of temp
            temp=nextNode;
        }
        //Test CASES
        ab in sab ko jodo
        if(oneHead.next==null){
            zeroTail.next=twoHead.next;
        }
        else{
            zeroTail.next=oneHead.next;
            oneTail.next=twoHead.next;
        }

        ab -1 saari node ko null kar do
        oneHead.next=null;
        twoHead.next=null;
        Node t1=zeroHead;
        zeroHead=zeroHead.next;
        t1.next=null;
        
        return zeroHead;
        
        
    }
}
