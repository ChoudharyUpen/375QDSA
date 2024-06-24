            5    
          /   \ 
         2     3
        /   
       4
        \
         1
        /  \
       7    6
class Solution{
    //Node Left Right -- Normal Traversal 
    //Four Cases can be here in case of Normal Traversal   -----
   Node lca(Node root, int n1,int n2){
	    //Base Case or     //4.None of a and b in any subtree
	    if(root==null)return null;
	     //1.cur=q || cur=b
	    if(root.data==n1|| root.data==n2)return root;
	    
	    
	    //Recurion call for left and right
	    Node left=lca(root.left,n1,n2);
	    Node right=lca(root.right,n1,n2);
	    
	     //3.Both a and b in any one subtree
	    if(left==null)return right;
	    if(right==null)return left;
	    
	     //2.a --- left subtree b --- right subtree
	    return root;
	}}
