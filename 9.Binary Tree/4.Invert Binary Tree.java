class Solution {
    public TreeNode invertTree(TreeNode root) {
        //Step 1 Base Case
        if(root==null) return root;

        //Step 2 Storing Left all by Recursion
        TreeNode ln=invertTree(root.left);
        //Step 2 Storing Right all by Recursion
        TreeNode rn=invertTree(root.right);
   
        //Step 3 Exchanging the value of left and right
        root.left=rn;
        root.right=ln;

        //Step 4 Returning the final answer
        return root;
    }
}
