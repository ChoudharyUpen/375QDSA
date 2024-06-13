class Solution {
    // Step 1 Ek global variable result ko initialize kar rahe hain jo hum return karenge
    List<List<Integer>> result;
    public List<List<Integer>> levelOrder(TreeNode root) {

         //Step 2 Ek variable result ko initialize kar rahe hain
        result=new ArrayList<>();
        if(root==null)return result;
          //Step 3  Function ko call kar rahe hain
        traverse(root,0);
       // Result ko return kar rahe hain
        return result;

    }
    private void traverse(TreeNode node,int level){
        //Step 4  node null hai, toh return karte hain 
        //That means the it is a leaf node and it has no children
        if(node == null)return;
        //Step 5 Agar result ki size current level ke barabar hai, toh hum ek nayi list add karte hain result mein.
        if(result.size()==level){
            result.add(new ArrayList<>());
        }
        //process the current node
        //Step 6 Current node ke value ko uske respective level wali list mein add karte hain.
        result.get(level).add(node.val);
        //Step7 Recursive Call for left child
        traverse(node.left,level+1);
         //Step7 Recursive Call for right child
        traverse(node.right,level+1);
    }
}
//Is tarah se, poora tree level-wise traverse hota hai aur har level ke nodes alag-alag lists mein store hote hain.
