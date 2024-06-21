class Tree{
    boolean isBalanced(Node root){
	return checkBalance(root)!=-1;
    }
    private int checkBalance(Node root){
        if(root==null)return 0;
        int lht=checkBalance(root.left);
        if(lht==-1) return -1;
        int rht=checkBalance(root.right);
        if(rht==-1) return -1;
        int heightDiff=Math.abs(lht-rht);
        if(heightDiff>1)return -1;
        return 1+Math.max(lht,rht);
    }}
