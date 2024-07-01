// Same as of Q7 only 1 differnce here we have to reverse also then we will get the correct answer


class Solution {
     ArrayList<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
   list= new ArrayList<> ();
   inorder(root);
   Collections.sort(list);
   Collections.reverse(list);
   return list.get(list.size()-k);
    }
    public void inorder(TreeNode root){
        if(root==null)return;
      
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }}
