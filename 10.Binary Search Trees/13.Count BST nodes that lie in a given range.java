class Solution{
    int count;
    int getCount(Node root,int l, int h){
        count=0;
        getCount1(root,l,h);
        return count;
    }
     void getCount1(Node root, int l, int h){
        if(root==null)return;
        getCount1(root.left,l,h);
        if(root.data>=l && root.data<=h)count++;
        getCount1(root.right,l,h);
    }}
    
    
//   Making it More Better   ----by using properties of bst
    class Solution{
    int count;
    int getCount(Node root,int l, int h){
        count=0;
        getCount1(root,l,h);
        return count;
    }
     void getCount1(Node root, int l, int h){
        if(root==null)return;
       
        if(root.data>=l && root.data<=h){
             count++;
             getCount1(root.left,l,h);
             getCount1(root.right,l,h);
        }else if(root.data<l){
                getCount1(root.right,l,h);
        }else{
            getCount1(root.left,l,h);
        }
    }}
