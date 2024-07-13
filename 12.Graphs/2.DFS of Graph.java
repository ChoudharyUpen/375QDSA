//gfg
Input: V = 5 , adj = [[2,3,1] , [0], [0,4], [0], [2]]

Output: 0 2 4 3 1
Explanation: 

0 is connected to 2, 3, 1.
1 is connected to 0.
2 is connected to 0 and 4.
3 is connected to 0.
4 is connected to 2.
so starting from 0, it will go to 2 then 4,
and then 3 and 1.
Thus dfs will be 0 2 4 3 1.


    
//this is a simple implementation of dfs in this question
class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        //we have to return the answer in arraylist thats why we are taking arraylist
        ArrayList<Integer> res = new ArrayList<>();
        //no need of queue in dfs
        boolean[] vis = new boolean[V];
        
        //calling the function
        dfs(adj, 0, vis, res);
        
         //finaly return the answer in the form of arraylist
        return res;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] vis, ArrayList<Integer> res) {
        res.add(curr);
        vis[curr] = true;

        //finding neighbor of the node we got
        for (int neighbor : adj.get(curr)) {
            if (!vis[neighbor]) {
                //using recursion
                //recursion call
                dfs(adj, neighbor, vis, res);
            }
        }
    }
}
