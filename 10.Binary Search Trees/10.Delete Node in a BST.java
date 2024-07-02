class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;

        if(key<root.val){
            root.left=deleteNode(root.left,key) ;
        }else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        //ab na element chota na bada element barabar
        else{
            //Case 1
            if(root.left==null){
  return root.right;
            }
            //Case 2
            else if(root.right==null){
                return root.left;
            }
            // Case 3 most important case
            //Step 1 find maximum of right subtree or find minimum of left subtree (find in oder sucessor)
            //Step2 Replace it 65 with 60
            root.val=minValue(root.right);
            //and because 60.next is null so deleting it
            root.right=deleteNode(root.right,root.val);
          
        }
        return root;
    }
    static int minValue(TreeNode root){
        int minv=root.val;
        while(root.left!=null){
            //har baar min ki value update kartha jange
            minv=root.left.val;
            //or agla ke liye call kar dega
            root=root.left;
        }
        return minv;
    }
}
