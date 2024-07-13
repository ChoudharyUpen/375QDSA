//gfg
//anuj bhaiya
//notes realted to this more in notebook

Input:  
V = 5, E = 5
adj = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}} 
Output: 1

  // Agar neighbor parent nahi hai to cycle mila ----this point is V.Imp for this question


  
class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];  // Visited array
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {  // Agar node visited nahi hai
                if (dfs(i, adj, vis, -1)) return true;  // Cycle mila to return true
            }
        }
        return false;  // Cycle nahi mila
    }

    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], int parent) {
        vis[v] = true;  // Current node ko visited mark karo
        
        for (int neighbor : adj.get(v)) {  // Saare neighbors ko check karo
            if (!vis[neighbor]) {  // Agar neighbor visited nahi hai
                if (dfs(neighbor, adj, vis, v)) return true;  // Recursive DFS call
            } else if (parent != neighbor) {  // Agar neighbor parent nahi hai to cycle mila
                return true;
            }
        }
        return false;  // Cycle nahi mila
    }
}
