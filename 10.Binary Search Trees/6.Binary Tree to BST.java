Input:
      1
    /   \
   2     3
Output: 
1 2 3

class Solution
{
    ArrayList<Integer> list = new ArrayList<>();
    void inorder(Node root)
    {
        if(root==null)  return;

          inorder(root.left);
          list.add(root.data);
          inorder(root.right);
    }
    
    //storeintact --- this will replace inorder traversal and sorted list
    void intact(Node root)
    {
        if(root==null)     return;
          
          intact(root.left);
          root.data=list.remove(0);
          intact(root.right);
    }
    
    //code
    Node binaryTreeToBST(Node root)
    {
       inorder(root);
       Collections.sort(list);
       
       intact(root);
       return root;
    }
}
 
 
