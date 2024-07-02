class Solution {
    Node prev;
    public Node flattenBST(Node root) {
        Node newNode=new Node(-2);
        prev=newNode;
        
        inorder(root);
        //ye jab sab se necha puch ja ga prev tau uska left or right ko null kar dega 
        prev.left=null;prev.right=null;
        //-2 se agla right node return kar dega
        return newNode.right;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            
            prev.left=null;prev.right=root;
            prev=root;
            
            inorder(root.right);
        }
    }
}
