class Solution {
    //we will do this question recursively
//Case 1 Null !NUll 
//Case 2 Null NUll
//Case 3 !Null !NUll
//    ---- Subcase
//    ---- Value is Same or Not?
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         if(root==null) {
            return false;
        }
        if(helper(root,subRoot)) {
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
     public boolean helper(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) {
            return true;
        }
        if(root==null || subRoot==null) {
            return false;
        } 
        if(root.val!=subRoot.val) {
            return false;
        }
        return helper(root.left,subRoot.left) && helper(root.right,subRoot.right);
    }
}
