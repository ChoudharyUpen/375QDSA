
//Floyd Warshall Algorithm will be used in this
 //Floyd Warshall Algorithm --- is used to calculate all pair shortest path
//learned from gfg solutions
//gfg

//User function template for JAVA

class Solution {
    public void shortest_distance(int[][] matrix) {
        int n = matrix.length;
        
        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = (int)(1e9);
                }
                if (i == j) {
                    matrix[i][j] = 0;
                }
            }
        }
        The matrix remains the same after k = 0:
       matrix = [
    [0, 1, 43],
    [1, 0, 6],
    [1e9, 1e9, 0]
]



  The matrix after k = 1:


matrix = [
    [0, 1, 7],
    [1, 0, 6],
    [1e9, 1e9, 0]
]
  The matrix remains the same after k = 2:


matrix = [
    [0, 1, 7],
    [1, 0, 6],
    [1e9, 1e9, 0]
]
        // Main logic with Floyd-Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                       matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    
                }
            }
        }
        
        // Final print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == (int)(1e9)) {
                    matrix[i][j] = -1;
                }
            }
        }
    }
}
