//learned from gfg solution & chatgpt
//question in dsa sheet is ----Number of Triangles in Directed and Undirected Graphs 
//and i have done this question Number of Triangles by searching for that question 



Take 3 index i,j,k (0<=i,j,k<n). {i,j}, {j,k}, {k,i} will form a triangle if i!=j and i!=k and j!=k and g[i][j]=1 and g[j][k]=1 and g[k][i]=1.
Input:
N=4
graph[][]={{0, 0, 1, 0}, 
           {1, 0, 0, 1},
           {0, 1, 0, 0}, 
           {0, 0, 1, 0}}
Output:
2
Explanation;
Triangle 1: {{0,2}, {2,1}, {1,0}}
graph[][]={{0, 0, 1, 0},
           {1, 0, 0, 1},
           {0, 1, 0, 0},
           {0, 0, 1, 0}}.  

Triangle 2: {{1,3}, {3,2}, {2,1}}
graph[][]={{0, 0, 1, 0},
           {1, 0, 0, 1},
           {0, 1, 0, 0},
           {0, 0, 1, 0}}. 




class Solution {
    // Yeh function graph mein triangles ke number ko count karega
    public static int numberOfTriangles(int n, int[][] g) {
        // Triangle ka count 0 se shuru karo
        int count = 0;

        // Triple nested loops use karte hain taaki har triplet (i, j, k) ko check kar sakein
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    // Check karte hain ki i, j, k alag-alag hain aur edges (i, j), (j, k), aur (k, i) exist karte hain
                    if (i != j && j != k && k != i && g[i][j] == 1 && g[j][k] == 1 && g[k][i] == 1) {
                        // Agar triangle mila to count ko increment karo
                        count++;
                    }
                }
            }
        }

        // Kyunki har triangle ko 3 baar count kiya gaya hai (har vertex par), isliye 3 se divide kar do
        return count / 3;
    }
}
