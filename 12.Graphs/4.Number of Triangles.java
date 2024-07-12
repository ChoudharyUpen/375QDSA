//learned from gfg solution & chatgpt
//question in dsa sheet is ----Number of Triangles in Directed and Undirected Graphs 
//and i have done this question Number of Triangles by searching for that question 

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
