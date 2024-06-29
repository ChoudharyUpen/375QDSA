class Solution
{       //Declaring a Global ARRAY LIST outside of main function
    ArrayList<Integer>list;
    public int kthLargest(Node root,int K)
    {
        //Initalizing the list variable
        list=new ArrayList<>();
        
        //Calling the Function
        inorder(root);
        
        //2 4 9
        Collections.sort(list); 
        //3 (list.size()) -2 == 1  which is value 4 so it will return
        return list.get(list.size()-K);
           
        
    }
    private void inorder(Node root)
    { 
        if(root==null){
            return ;
        }
        else{
            //finding inorder of bst and adding it into the tree
            inorder(root.left);
            list.add(root.data);
            inorder(root.right);
        }
        
    }

    
}
