
class Solution{
     public boolean isValidBST(TreeNode root) {
        return isBST(root);     
        //this code is in O(1) TC 
     }

//initalizng a previous to null
 TreeNode prev=null;
 boolean isBST(TreeNode node){
    //agar node he null hai tau return true
    if(node!=null){
        //agar left subtree sa false milta hai tau nahi hai tree
        if(!isBST(node.left)) return false;

        //10>=5
        if(prev!=null && prev.val >= node.val) return false;

       //changing the position of previous
        prev=node;
        return isBST(node.right);

    }
    return true;
 }
}
