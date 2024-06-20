class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode ln=invertTree(root.left);
        TreeNode rn=invertTree(root.right);
        root.left=rn;
        root.right=ln;
        return root;
    }}
