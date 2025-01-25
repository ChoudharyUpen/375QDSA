class Solution
{
    int leafLevel = 0;
    boolean check(Node root)
    {
       return sameLevelOrNot(root, 0);
    }
     boolean sameLevelOrNot(Node root, int level) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            if (leafLevel == 0) {
                leafLevel = level;
                return true;
            }
            return level == leafLevel;
        }
        return sameLevelOrNot(root.left, level + 1) && sameLevelOrNot(root.right, level + 1);
    }
}


















class Solution
{
    // Approach ---- Step1 phela first leafnode check karo uska level store karwo
// step2 check karo koi or leaf node tau nahi hai agar hai tau check karo kya first leaf node or is leaf node ka level same hai
//agar level same nahi hai tau return false it means all leaves are not at the same level

     int leafLevel = 0;
    boolean check(Node root)
    {
       return sameLevelOrNot(root, 0);
    }
     boolean sameLevelOrNot(Node root, int level) {
        // Base case: If the tree is empty
        if (root == null) {
            return true;
        }
        // If this is a leaf node
        if (root.left == null && root.right == null) {
            // If it's the first leaf node, set the leaf level
            if (leafLevel == 0) {
                leafLevel = level;
                return true;
            }
            // If this is not the first leaf node, check if level matches
            return level == leafLevel;
        }
        // Recursively check for left and right subtrees
        return sameLevelOrNot(root.left, level + 1) && sameLevelOrNot(root.right, level + 1);
    }
}
