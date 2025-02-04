
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
    Node insert(Node root, int Key) {
       if(root==null)return new Node(Key);
       if(root.data==Key)return root;
       if(root.data>=Key)root.left=insert(root.left,Key);
       else root.right=insert(root.right,Key);
       return root;  
    }
}


















class Solution {
    Node insert(Node root, int Key) {
        //when a new node is inserted  in bst it is added as leaf node
        //so we are returning a new node so that it may get inserted
       //(I.M Step)
            
       if(root==null)return new Node(Key);
       
       //This is a Corner Case of this Question
       if(root.data==Key)return root;
       
       if(root.data>=Key)root.left=insert(root.left,Key);
       else root.right=insert(root.right,Key);
      
       return root;  
       
    }
}
