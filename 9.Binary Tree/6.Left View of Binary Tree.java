class Tree{
    ArrayList<Integer> leftView(Node root){
       ArrayList<Integer> numbers = new ArrayList<>();
        leftViewUtil(root,numbers,0);
        return numbers;
    }
    void leftViewUtil(Node root,ArrayList list,int level){
        if(root==null)return;
        //if level is already filled then does not add anything in the list otherwise add
         if(level == list.size()){
            list.add(root.data);
        }
        leftViewUtil(root.left,list,level+1);
        leftViewUtil(root.right,list,level+1);
    }}
