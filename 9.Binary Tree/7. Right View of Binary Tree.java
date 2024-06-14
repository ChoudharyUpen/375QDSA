class Solution{
    ArrayList<Integer> rightView(Node node) {
        //Step1 Creating a Array List which we will return as answer
         ArrayList<Integer> numbers = new ArrayList<>();
        //Step2 this is the M.Imp thing Calling the Function
        leftViewUtil(node,numbers,0);
        //Returning the final answer
        return numbers;
    }
    void leftViewUtil(Node node,ArrayList list,int level){
        if(node==null)return;
        //if level is already filled then does not add anything in the list otherwise add
         if(level == list.size()){
            list.add(node.data);
        }
         //Recursion for Right
        leftViewUtil(node.right,list,level+1);
        //Recursion for Left
        leftViewUtil(node.left,list,level+1);
    }
    }
