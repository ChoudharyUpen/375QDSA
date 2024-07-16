class Solution{
    //learn topogical sort befor doing this 
    //learned from anuj bhaiya
    //gfg
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
  
  boolean vis[]=new boolean[V];
  Stack<Integer> stack =new Stack();
  
  for(int i=0;i<V;i++){
      if(!vis[i]){
          //calling the dfs function
          dfs(adj,i,stack,vis);
      }
  }
  //huma stack nahi return karna huma array return karna hai isliye ye bange
  //or fir iska andar value dalenge
  int ans[]=new int[V];
  int i=0;
  while(!stack.isEmpty()){
      ans[i++]=stack.pop();
  }
  return ans;
    }
    static void dfs(ArrayList<ArrayList<Integer>>adj,int v
    ,Stack<Integer> stack, boolean[] vis){
        vis[v]=true;
        for(int neighbor:adj.get(v)){
            if(!vis[neighbor]){
          dfs(adj,neighbor,stack,vis);
      }
        }
        //this is the M.Imp
        stack.push(v);
    }
}
