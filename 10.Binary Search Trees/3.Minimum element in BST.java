class Solution {
    int minValue(Node root) {
             if (root == null) return Integer.MAX_VALUE;
        //   int min=root.data;
    return  Minimum(root,root.data);
    //  return min;
    }private int Minimum(Node root,int min)
    {
        if(root==null){
            //this is the final return when root got empty then we are returning mimimum
            return min;
        }
        if(root.data<min){
            min =root.data;
        }
        
        int leftMin = Minimum(root.left,min);
          int rightMin =Minimum(root.right, min);
        // return min;
        //this is not final return this is a return to downside of the stack 
         return Math.min(leftMin, rightMin);
    }
}
