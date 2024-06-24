Summary ---
        1
      /   \
     2     3
    /  \  /  \
   4   5  6   7
For 6 Path --- 1,3,6
For 7 Path --- 1,3,7
we are going to find path then we are going to find 
common path betwen them 
and return pathA.size()-i+pathB.size()-j; 

class GfG {
    void help(Node root,ArrayList<Integer> curPath,ArrayList<Integer> pathA,ArrayList<Integer> pathB,int a,int b){
        if(root==null)return;
        curPath.add(root.data);
        //storing path of A and B
        if(root.data==a)pathA.addAll(curPath);
        if(root.data==b)pathB.addAll(curPath);
        //recursion for left 
        help(root.left,curPath,pathA,pathB,a,b);
         //recursion for right
        help(root.right,curPath,pathA,pathB,a,b);
        //curPath remove bhi karna padega warna wo pura tree ko path ma store krwa lega 
        curPath.remove(curPath.size()-1);
    }
    //hum is ma path find karenge or fir answer nikalenge
    //ye acha question hai iska explanation 1 alag se copy bana k 
    //uska page p karna 
    int findDist(Node root, int a, int b) {
        //Step 1 3 List bana li ek pura path store karwa gi
        ArrayList<Integer> curPath = new ArrayList<>();
        //ye list sirf path of a store karwa gi
        ArrayList<Integer> pathA = new ArrayList<>();
        //ye list sirf path of b store karwa gi
        ArrayList<Integer> pathB = new ArrayList<>();
        //is function ko call kar diya ye huma path of a and b return karega 
        help(root,curPath,pathA,pathB,a,b);
        int i=0,j=0;
        //ye par hum check kar rahe hai ki same path kitna hai
        while(i<pathA.size() && j<pathB.size()){
            //agr dono ka path equal nahi hato break kar jo matalb hum 6 or 7 pa aa gye
            //pathA -- 1,3  or pathB -- 1,3 ye par ye code braek nahi karega 
            //lekin jab pathA --6 or pathB -- 7 ayega tab ye break kar jayega
            if(pathA.get(i)!=pathB.get(j))break;
            i++;
            j++;
        }
        //here 3-2(i)+ 3-2(j)=1+1=2 answer
        return pathA.size()-i+pathB.size()-j;
    }}
