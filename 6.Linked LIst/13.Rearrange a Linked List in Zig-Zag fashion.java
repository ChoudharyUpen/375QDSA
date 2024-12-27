class Solution{
	public static Node zigZag(Node head){
        Node temp = head;
        int flag = 0;
        while(temp.next!=null){
            if(flag == 0){
                if(temp.data>temp.next.data){
                    int val = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = val;
                }
                flag = 1;
            }
            else{
                flag = 0;
                if(temp.data<temp.next.data){
                    int val = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = val;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
