//leetcode
//anuj bhaiya

//four cases can be here
1.curr=a || curr=b
2. a=left subtree, b=right subtree
3.both a and b in any one subtree
4.none of a and b in any subtree 
    
Example 1:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;
        if (left != null) return left;
        return right;
    }
}
