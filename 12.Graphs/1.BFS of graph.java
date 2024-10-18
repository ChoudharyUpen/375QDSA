//GFG
// Find ---- ?
// What is the use of ArrayList<ArrayList<Integer>> adj
// double ArrayList in this question
Input:
V = 5, E = 4
adj = {{1,2,3},{},{4},{},{}}
Output: 
0 1 2 3 4
Explanation: 

0 is connected to 1 , 2 , 3.
2 is connected to 4.
so starting from 0, it will go to 1 then 2
then 3. After this 2 to 4, thus bfs will be
0 1 2 3 4.

    Everything was correct what i was doing but i was not considering this kis mai answer return karna hai         ArrayList<Integer> res = new ArrayList<>();


//this is a simple implementation of bfs in this question
class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        //we have to return the answer in arraylist thats why we are taking arraylist
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis= new boolean[V];
        
        q.add(0);
        vis[0] = true;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            result.add(node );
            
            //finding neighbor of the node we got
            for(int neighbor : adj.get(node)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        //finaly return the answer in the form of arraylist
        return res;
    }
}
    
