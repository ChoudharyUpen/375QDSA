
        15
         \
          20
             \
              30   and we want to add 25 so we will add 
               \
                25

25 in the 
downside of 30 beacuase


if(root.data > Key)
        root.left = insert(root.left , Key);
        this will apply here

        21
      /   \
     14    25
       /      \
       8       22   if we want to add 22 we will add like this
this will apply here
     else root.right = insert(root.right , Key);
        












class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
         if(root == null)
        return new Node(Key);
        
        if(root.data == Key)
        return root;
        
        if(root.data > Key)
        root.left = insert(root.left , Key);
        
        else root.right = insert(root.right , Key);
        
        return root;
    }
}
