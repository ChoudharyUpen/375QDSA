2 se jayda Difference nahi hona chaiye
      30
      /
     20
    /
   10
this tree is balanced tree  but not sorted
     node
   /   \
 small    big

Youtuber used same approached as me
Height can be 0,1,-1;
Not More than that 



class GfG{
    Node buildBalancedTree(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(arr,root);
        return traverse(arr,0,arr.size()-1);
    }
    void inorder(ArrayList<Integer> arr,Node root){
        if(root.left!=null)inorder(arr,root.left);
        arr.add(root.data);
        if(root.right!=null)inorder(arr,root.right);
    }
    Node traverse(ArrayList<Integer> arr,int start,int end){
        if(start>end)return null;
        int mid = (start + end+1)/2;
        Node root = new Node(arr.get(mid));
        root.left = traverse(arr,start,mid-1);
        root.right = traverse(arr,mid+1,end);
        return root;
    }}
