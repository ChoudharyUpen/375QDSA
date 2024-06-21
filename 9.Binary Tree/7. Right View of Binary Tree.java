class Solution{
    ArrayList<Integer> rightView(Node node) {
         ArrayList<Integer> numbers = new ArrayList<>();
        leftViewUtil(node,numbers,0);
        return numbers;
    }
    void leftViewUtil(Node node,ArrayList list,int level){
        if(node==null)return;
         if(level == list.size()){
            list.add(node.data);
        }
        leftViewUtil(node.right,list,level+1);
        leftViewUtil(node.left,list,level+1);
    }}
