class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
        //Step1 Creating a Array List which we will return as answer
       ArrayList<Integer> numbers = new ArrayList<>();
        //Step2 this is the M.Imp thing Calling the Function
        leftViewUtil(root,numbers,0);
        //Returning the final answer
        return numbers;
    }
    void leftViewUtil(Node root,ArrayList list,int level){
        if(root==null)return;
        //if level is already filled then does not add anything in the list otherwise add
         if(level == list.size()){
            list.add(root.data);
        }
        //Recursion for Left
        leftViewUtil(root.left,list,level+1);
        //Recursion for Right
        leftViewUtil(root.right,list,level+1);
    }
}
