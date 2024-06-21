class Solution {
    private int p = 0; // preorder index
    private int i = 0; // inorder index

    // Tree build karne ka main function
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MIN_VALUE); // initial call with Integer.MIN_VALUE
    }
    // Recursive function jo tree build karta hai
    private TreeNode build(int[] preorder, int[] inorder, int stop) {
        if (p >= preorder.length) { // agar preorder array khatam ho gaya
            return null; // return null
        }
        if (inorder[i] == stop) { // agar inorder ka current element stop ke barabar hai
            ++i; // inorder index increment karo
            return null; // return null
        }

        TreeNode node = new TreeNode(preorder[p++]); // naya node banao preorder[p] se
        node.left = build(preorder, inorder, node.val); // left child ke liye recursive call
        node.right = build(preorder, inorder, stop); // right child ke liye recursive call
        return node; // node return karo
    }
}

    
