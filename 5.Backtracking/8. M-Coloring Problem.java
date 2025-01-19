class solve {
    public boolean isSafe(int c, int ind, boolean graph[][], int color[]) {
        for (int i = 0; i < graph[ind].length; i++) {
            if (graph[ind][i]) {
                if (color[i] == c) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean f(int ind, int color[], boolean graph[][], int m, int n) {
        if (ind == n) return true;

        for (int j = 1; j <= m; j++) {
            if (isSafe(j, ind, graph, color) && color[ind] == 0) {
                color[ind] = j;
                if (f(ind + 1, color, graph, m, n) == true) return true;
                color[ind] = 0;
            }
        }
        return false;
    }

    public boolean graphColoring(boolean graph[][], int m, int n) {
        int color[] = new int[n];
        return f(0, color, graph, m, n);
    }
}














//gfg
//gfg solutions
class solve {
// 1. isSafe Function: Yeh function check karta hai ki kya current vertex ko given color se color karna safe hai ya nahi.
// 2. f Function: Yeh ek recursive function hai jo graph ko color karne ki koshish karta hai.
// 3. graphColoring Function: Yeh main function hai jo graph ko color karne ke liye f function ko call karta hai.
    
    // Yeh function check karta hai ki kya current vertex ko given color se color karna safe hai ya nahi.
    public boolean isSafe(int c, int ind, boolean graph[][], int color[]) {
        // Saare adjacent vertices ko check karo
        for (int i = 0; i < graph[ind].length; i++) {
            // Agar `ind` aur `i` ke beech edge hai
            if (graph[ind][i]) {
                // Agar `i` vertex already same color se colored hai
                if (color[i] == c) {
                    return false; // Toh `ind` ko color `c` se color karna safe nahi hai
                }
            }
        }
        return true; // Agar koi conflict nahi mila toh safe hai
    }

    // Yeh ek recursive function hai jo graph ko color karne ki koshish karta hai.
    public boolean f(int ind, int color[], boolean graph[][], int m, int n) {
        // Agar saare vertices ko color kar diya toh return true
        if (ind == n) return true;

        // 1 se leke m colors tak try karo
        for (int j = 1; j <= m; j++) {
            // Agar color `j` safe hai aur `ind` vertex abhi tak colored nahi hai
            if (isSafe(j, ind, graph, color) && color[ind] == 0) {
                color[ind] = j; // Color `ind` vertex with color `j`
                // Next vertex ko color karne ki koshish karo
                if (f(ind + 1, color, graph, m, n) == true) return true;
                color[ind] = 0; // Agar coloring successful nahi hui toh backtrack karo (color ko 0 kar do)
            }
        }
        return false; // Agar koi color safe nahi hai toh return false
    }

    // Yeh main function hai jo graph ko color karne ke liye `f` function ko call karta hai.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int color[] = new int[n]; // Saare vertices ke liye color array initialize karo (initially sabka color 0 hai)
        return f(0, color, graph, m, n); // Recursive function `f` ko start karo from vertex 0
    }
}
