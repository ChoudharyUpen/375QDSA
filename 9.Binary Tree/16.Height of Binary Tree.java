class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if (node == null) {
            return 0;
        }
        int ln=height(node.left);
        int rn=height(node.right);
        return Math.max(ln,rn) +1;
    }}
