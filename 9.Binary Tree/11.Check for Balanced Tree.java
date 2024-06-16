class Tree{
    //agar koi subtree unbalanced hai to immediately -1 return karta hai.
    boolean isBalanced(Node root)
    {
	return checkBalance(root)!=-1;
    }
    private int checkBalance(Node root){
        if(root==null)return 0;
        int lht=checkBalance(root.left);
        if(lht==-1) return -1;
        int rht=checkBalance(root.right);
        if(rht==-1) return -1;
        int heightDiff=Math.abs(lht-rht);
        //Agar return hota hai -1 tau tree 
        //unbalanced hai or hama baki node k liye check karni ki 
        //jaroot nahi hai
        if(heightDiff>1)return -1;
        return 1+Math.max(lht,rht);
    }}
