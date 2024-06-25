class Solution {
    // Hum is sawal ko recursively solve karenge
    //Case 1: Null aur !Null 
    //Case 2: Null aur Null
    //Case 3: !Null aur !Null
    //    ---- Subcase: Value same hai ya nahi?

//Ye method check karega ki subRoot tree root tree ka subtree hai ya nahi.
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Agar root null hai, to directly false return karo
        if(root==null) {
            return false;
        }
        // Agar helper function true return karta hai, to true return karo
        if(helper(root, subRoot)) {
            return true;
        }
        // Nahi to root ke left aur right subtree ko check karo
//Agar yeh line nahi hogi, to sirf root ke sath subRoot ko compare 
//karke hi answer mil jayega, aur uske left aur right subtrees ko check nahi kiya jayega.

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean helper(TreeNode root, TreeNode subRoot) {
        // Dono root aur subRoot null hain, to true return karo
        if(root==null && subRoot==null) {
            return true;
        }
        // Agar koi ek null hai aur doosra null nahi hai, to false return karo
        if(root==null || subRoot==null) {
            return false;
        } 
        // Agar root aur subRoot ki value same nahi hai, to false return karo
        if(root.val != subRoot.val) {
            return false;
        }
        // Recursively left aur right subtree ko check karo
        return helper(root.left, subRoot.left) && helper(root.right, subRoot.right);
    }
}
