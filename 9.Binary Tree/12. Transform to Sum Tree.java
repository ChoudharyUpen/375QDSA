class Solution{
    public void toSumTree(Node root){
         transform(root);
    }
    private int transform(Node root){
        if(root==null)return 0;
        int l=transform(root.left);
        int r=transform(root.right);
        int temp=root.data;
        root.data=l+r;
        return temp+l+r;
    }}
