class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        //Base Case 1
         if(root1==null && root2==null)//both trees are empty
         return true;
         
         //Base Case 2
         if(root1==null || root2==null)//one of the tree empty
         return false;
         
         if(root1.val!=root2.val)
         return false;
         
         else
         return(isSameTree(root1.right,root2.right)&& isSameTree(root1.left,root2.left));
    }
}
