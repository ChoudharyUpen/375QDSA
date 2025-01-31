//this code is better than code below it learn and modify it according to your self 
class Solution {
    static Node segregate(Node head) {
       Node zeroHead=new Node(0);
       Node zero=zeroHead;
       Node oneHead=new Node(0); 
       Node one=oneHead;
       Node twoHead=new Node(0);  
       Node two=twoHead;
      
       Node curr=head;
       while(curr!=null){
           if(curr.data==1){
               one.next=curr;
               one=one.next;
           }
           else if(curr.data==0){
               zero.next=curr;
               zero=zero.next;
           }
           else{
               two.next=curr;
               two=two.next;
           }
           curr=curr.next;
           two.next=null;
           one.next=twoHead.next;
           zero.next=oneHead.next;
       }
       return zeroHead.next;
    }
}















//do this question again by seeing all the solutions  because in ending part still there is a confusion 


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

Aapka Doubt:
"Dummy nodes ka kaam already khatam ho gaya tha, toh unhe null karne ki zarurat kyu?"

Answer:
Haan, technically humne dummy nodes (-1) ka kaam already finish kar diya tha jab humne:


zeroTail.next = oneHead.next;
oneTail.next = twoHead.next;
lekin safe programming ke liye hum dummy nodes ko poora disconnect karte hain.
oneHead.next=null;
twoHead.next=null;
Node t1=zeroHead;
zeroHead=zeroHead.next;
t1.next=null;
Iska reason hai:

Agar kisi aur part of code mein accidentally dummy nodes ka access ho jaaye, toh wo galat result na de.
Memory management ke liye bhi zaroori hai, kyunki ab dummy nodes ki zarurat nahi hai.
