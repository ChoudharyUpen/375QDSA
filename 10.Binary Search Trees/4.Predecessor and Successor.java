class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        Node temp=root;
        //first we are finding Predecessor
        while(temp!=null){
            if(temp.data>=key)temp=temp.left;
            else{
                pre[0]=temp;
                temp=temp.right;
            }
        }
        temp=root;
          //then we are finding  Successor

        while(temp!=null){
            if(temp.data<=key)temp=temp.right;
            else{
                suc[0]=temp;
                temp=temp.left;
            }
        }
    }
}
