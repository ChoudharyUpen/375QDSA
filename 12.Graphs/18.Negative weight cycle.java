//Bellman Ford Algorithm is used in this 
//from anuj bhaiya video
class Solution{
    public int isNegativeWeightCycle(int n, int[][] edges){

        int dist[] = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[0] = 0;
        
        for(int i = 0;i<n-1;i++) {
            
            for(int j=0;j<edges.length;j++){
                
                int u = edges[j][0];
                int v = edges[j][1];
                int wt = edges[j][2];
                
                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }
        }
        
        // check if cycle exist or not
        for(int j=0;j<edges.length;j++){
                
            int u = edges[j][0];
            int v = edges[j][1];
            int wt = edges[j][2];
                
            if(dist[u] + wt < dist[v]){
               return 1;
            }
        }
        
        return 0;
    }
}
