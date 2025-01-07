this is more better code then the code below it 
class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1 = head1;
        Node temp2 = head2;
        if(head1==null || head2==null)  return null;

        while(temp1!=temp2)
        {
            if(temp1==null)
            {
                temp1 = head2;
            }
            else{
                temp1 = temp1.next;
            }

            
           if(temp2==null)   
           { 
            temp2 = head1;
           }
           else{
            temp2 = temp2.next;
           }
        }
        
        return temp1;
    }
}








this code is more  easy to understable than the code given below 
	this file was updated on 2 july 2024 9:24pm this code is totaly written by myself when praticing coding by self tak -tak -tak
class Intersect{
	int intersectPoint(Node head1, Node head2){
         Node temp1=head1;
         int len1=0;
         while(temp1!=null){
             len1++;
             temp1=temp1.next;
         }
         Node temp2=head2;
         int len2=0;
         while(temp2!=null){
             len2++;
             temp2=temp2.next;
         }
         int diff=Math.abs(len1-len2);
         while(diff>0){
             if(len1>len2){
                 head1=head1.next;
                 diff--;
             }
              else if(len1<len2){
                 head2=head2.next;
                 diff--;
             }
         }
         Node slow=head1,fast=head2;
         while(slow.next!=fast.next){
             slow=slow.next;
             fast=fast.next;
         }
             return slow.next.data;
	}
}





This Code was Written Before:
// class Intersect
// {
//     //Function to find intersection point in Y shaped Linked Lists.
// 	int intersectPoint(Node head1, Node head2)
// 	{
//         int len1=0, len2=0;
//         //  Dono Ki length Calcualte kar li
//         for(Node curr=head1;curr!=null;curr=curr.next){
//             len1++;
//         }
//          for(Node curr=head2;curr!=null;curr=curr.next){
//             len2++;
//         }
//         int diff=Math.abs(len1-len2);
//         Node first=head1,second=head2;
//         if(len1>len2){
//             while(diff>0)
//             {
//                 first=first.next;
//                 diff--;
//             }
//             }else{
//                 while(diff>0){
//                     second=second.next;
//                     diff--;
//                 }
//             }
//             while(first!=second){
//                 first=first.next;
//                 second=second.next;
//             }
//             if(first!=null) return first.data;
//             return -1;
//         }
// 	}
