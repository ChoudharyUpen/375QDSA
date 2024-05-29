class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
        int len1=0, len2=0;
        //  Dono Ki length Calcualte kar li
        for(Node curr=head1;curr!=null;curr=curr.next){
            len1++;
        }
         for(Node curr=head2;curr!=null;curr=curr.next){
            len2++;
        }
        int diff=Math.abs(len1-len2);
        Node first=head1,second=head2;
        if(len1>len2){
            while(diff>0)
            {
                first=first.next;
                diff--;
            }
            }else{
                while(diff>0){
                    second=second.next;
                    diff--;
                }
            }
            while(first!=second){
                first=first.next;
                second=second.next;
            }
            if(first!=null) return first.data;
            return -1;
        }
	}
