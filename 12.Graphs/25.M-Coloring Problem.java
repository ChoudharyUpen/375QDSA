//gfg
//from gfg solutions
class solve {
    public boolean graphColoring(boolean graph[][], int m, int n) {
        return solve(graph,m,new int[n],0,n);
    }
    private boolean solve(boolean graph[][],int m,int colors[],int node,int n){
        if(node==n){
            return true;
        }
        
        for(int i=1;i<=m;i++){
            if(isSafe(node,colors,graph,n,i)){
                colors[node]=i;
                if(solve(graph,m,colors,node+1,n)) return true;
                colors[node]=0;
            }
        }
        
        return false;
    }
    
    private boolean isSafe(int node,int colors[],boolean graph[][],int n,int i){
         for(int j=0;j<n;j++){
            if(graph[node][j]==true && colors[j]==i){
                return false;
            }
            
        }
        return true;
    }
    
}
