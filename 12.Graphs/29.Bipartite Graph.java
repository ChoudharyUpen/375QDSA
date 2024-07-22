//gfg
//from gfg solutions
class Solution {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V];  // Har node ka color store karne ke liye array
        Arrays.fill(color, -1);  // Sabhi nodes ko initially uncolored (-1) set karo

        Queue<Integer> q = new LinkedList<>();  // BFS ke liye queue initialize karo

        // Sabhi nodes par iterate karo
        for (int i = 0; i < V; ++i) {
            if (color[i] == -1) {  // Agar node i ab tak color nahi hui
                q.add(i);  // Node i ko queue mein add karo
                color[i] = 0;  // Node i ko color 0 do

                // BFS start karo
                while (!q.isEmpty()) {
                    int u = q.poll();  // Queue se node u ko dequeue karo
                    int c = color[u];  // Node u ka current color

                    // Node u ke sabhi neighbors par iterate karo
                    for (int v : adj.get(u)) {
                        if (color[v] == -1) {  // Agar node v ab tak color nahi hui
                            color[v] = c == 0 ? 1 : 0;  // Neighbor node v ko opposite color do
                            q.add(v);  // Neighbor node v ko queue mein add karo
                        } else if (color[v] == c) {  // Agar neighbor node ka color same hai
                        //colour same he nahi hona chaiye
                            return false;  // Graph bipartite nahi hai, false return karo
                        }
                    }
                }
            }
        }
        return true;  // Agar koi conflict nahi mila, to graph bipartite hai
    }
}
