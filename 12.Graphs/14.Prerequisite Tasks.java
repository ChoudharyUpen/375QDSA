//gfg
//learned from gfg solutions
//learned from chatgpt 

Input: 
N = 4, P = 3
prerequisites = {{1,0},{2,1},{3,2}}
Output:
Yes








class Solution {
    public boolean isPossible(int N, int P, int[][] arr) {
        // Step 1: Initialize in-degree array to store number of incoming edges for each node
        int[] inDegree = new int[N]; // In-degree array initialize karte hain
        
        // Step 2: Initialize adjacency list to store graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++)
            adj.add(new ArrayList<>()); // Adjacency list initialize karte hain

        // Step 3: Fill adjacency list and in-degree array
        for (int i = 0; i < P; i++) {
            int u = arr[i][0];
            int v = arr[i][1];
            adj.get(v).add(u); // Graph ke edges add karte hain
            inDegree[u]++; // In-degree ko update karte hain
        }

        // Step 4: Initialize queue to store nodes with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++)
            if (inDegree[i] == 0)
                queue.add(i); // In-degree 0 wale nodes ko queue mein daalte hain

        // Step 5: Perform topological sort
        int count = 0; // Processed nodes ka count
        while (!queue.isEmpty()) { // Jab tak queue empty nahi hoti
            int current = queue.poll(); // Queue se node nikaal ke process karte hain
            count++; // Processed nodes ka count badhate hain
            for (int neighbor : adj.get(current)) { // Current node ke neighbors ko check karte hain
                inDegree[neighbor]--; // Neighbor ka in-degree kam karte hain
                if (inDegree[neighbor] == 0) // Agar neighbor ka in-degree 0 ho gaya
                    queue.add(neighbor); // To usse queue mein add karte hain
            }
        }

        // Step 6: Check if all tasks can be completed
        return count == N; // Agar processed nodes count == N hai, to return true, otherwise false
    }
}
