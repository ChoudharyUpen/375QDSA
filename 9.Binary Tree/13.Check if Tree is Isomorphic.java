class Solution  
{ 
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2)  
    { 
         //Base Case 1
         if(root1==null && root2==null)//both trees are empty
         return true;
         
         //Base Case 2
         if(root1==null || root2==null)//one of the tree empty
         return false;
         
         if(root1.data!=root2.data)
         return false;
         
         else
         return(isIsomorphic(root1.right,root2.right)&& isIsomorphic(root1.left,root2.left)|| isIsomorphic(root1.right,root2.left)&& isIsomorphic(root1.left,root2.right)
         );
         
    }
    
}    
