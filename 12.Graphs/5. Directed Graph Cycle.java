//GFG
//ANUJ BHAIYA
//notes realted to this more is in notebook
Input:
0 -> 1->2 ->3 ->3


Output: 1
Explanation: 3 -> 3 is a cycle

class Solution {
    // Yeh function check karta hai ki graph cyclic hai ya nahi
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // Visited array banate hain taaki hum check kar saken ki node visit hui hai ya nahi
        boolean vis[] = new boolean[V];
        // Recursion stack array banate hain taaki hum path track kar saken
        boolean recS[] = new boolean[V];
        
        // Har ek vertex ke liye check karenge
        for(int i = 0; i < V; i++){
            // Agar vertex visited nahi hai
            if(!vis[i]){
                // DFS call karenge aur agar cycle milti hai to true return karenge
                if(dfs(i, adj, vis, recS)) return true;
            }
        }
        // Agar kahin bhi cycle nahi milti to false return karenge
        return false;
    }
    
    // Yeh DFS function hai jo cycle check karta hai
    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], boolean recS[]){
        // Current node ko visited aur recursion stack mein mark karte hain
        vis[v] = true;
        recS[v] = true;
        
        // Saare neighbors ko traverse karte hain
        for(Integer neighbor : adj.get(v)){
            // Agar neighbor visited nahi hai to DFS call karenge
            if(!vis[neighbor]){
                if(dfs(neighbor, adj, vis, recS)){
                    // Agar cycle milti hai to true return karenge
                    return true;
                }
            // Agar neighbor recursion stack mein hai to cycle hai, true return karenge
            } else if(recS[neighbor]){
                return true;
            }
        }
        // Current node ko recursion stack se hata dete hain
        recS[v] = false;
        // Agar cycle nahi milti to false return karte hain
        return false; 
    }
}
