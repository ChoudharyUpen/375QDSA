class Solution {
    int ans = 0; 
    int diameter(Node root) {
       height(root);
        return ans;  // Return the final diameter value
    }
     private int height(Node node) {
        if (node == null) return 0;
        int lh = height(node.left);  
        int rh = height(node.right);  
        ans = Math.max(ans, 1 + lh + rh);  // Update the maximum diameter
        return 1 + Math.max(lh, rh);  // Return the height of the current node
    }}
