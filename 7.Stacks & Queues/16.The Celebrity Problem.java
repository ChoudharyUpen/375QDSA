class Solution {
    public int celebrity(int mat[][]) { 
       int n = mat.length;

        //step 1 find potentaial celebrity
        int candidate=0;
        for(int i=1;i<n;i++){
            if(mat[ candidate][i]==1){
                candidate=i;            
            }
        }
        //now verify potential celbrity
         for(int i=0;i<n;i++){
             while(i!=candidate && (mat[candidate][i]==1 || mat[i][candidate]==0)){
                 return -1;
             }
         }
return candidate;
    }
}
