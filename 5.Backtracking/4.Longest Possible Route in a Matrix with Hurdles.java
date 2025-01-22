class Solution {
    static class PathLength {
        int max = -1;
    }

    public static int longestPath(int[][] mat, int n, int m, int xs, int ys, int xd, int yd) {
        if (mat[xs][ys] == 0 || mat[xd][yd] == 0) {
            return -1;
        }
        PathLength length = new PathLength();
        boolean vis[][] = new boolean[n][m];
        helper(mat, n, m, xs, ys, xd, yd, 0, length, vis);
        return length.max;
    }

    public static void helper(int matrix[][], int n, int m, int xs, int ys, int xd, int yd, int temp, PathLength length, boolean vis[][]) {
        // Base Case for Invalid Conditions
        if (xs < 0 || ys < 0 || xs >= n || ys >= m || matrix[xs][ys] == 0 || vis[xs][ys] == true) {
            return;
        }
        //Destination Reached
        if (xs == xd && ys == yd) {
            length.max = Math.max(temp, length.max);
            return;
        }
        //Mark Current Cell as Visited
        vis[xs][ys] = true;
        //Explore 4 Possible Directions
        helper(matrix, n, m, xs + 1, ys, xd, yd, temp + 1, length, vis);
        helper(matrix, n, m, xs - 1, ys, xd, yd, temp + 1, length, vis);
        helper(matrix, n, m, xs, ys + 1, xd, yd, temp + 1, length, vis);
        helper(matrix, n, m, xs, ys - 1, xd, yd, temp + 1, length, vis);
        // Backtrack (Unmark the Cell)
        vis[xs][ys] = false;
    }
}














//gfg
//gfg solutions

class Solution {
    // PathLength class ko static banaya, jo max length ko store karega
    static class PathLength {
        int max = -1;
    }

    // longestPath method jo start aur end point ke beech ki longest path ko find karega
    public static int longestPath(int[][] mat, int n, int m, int xs, int ys, int xd, int yd) {
        // Agar starting ya ending point pe obstacle hai (0), to -1 return karo
        if (mat[xs][ys] == 0 || mat[xd][yd] == 0) {
            return -1;
        }

        PathLength length = new PathLength();
        boolean vis[][] = new boolean[n][m];

        // Recursive helper function call karo initial conditions ke saath
        helper(mat, n, m, xs, ys, xd, yd, 0, length, vis);
        return length.max;
    }

    // Recursive helper method jo path ko explore karega
    public static void helper(int matrix[][], int n, int m, int xs, int ys, int xd, int yd, int temp, PathLength length, boolean vis[][]) {
        // Agar matrix boundaries cross ho jaayein ya obstacle ho ya already visited ho, to return karo
        if (xs < 0 || ys < 0 || xs >= n || ys >= m || matrix[xs][ys] == 0 || vis[xs][ys] == true) {
            return;
        }

        // Agar destination point mil gaya, to max length update karo
        if (xs == xd && ys == yd) {
            length.max = Math.max(temp, length.max);
            return;
        }

        // Current cell ko visit kiya mark karo
        vis[xs][ys] = true;

        // 4 directions mein move karo: down, up, right, left aur recursively call karo helper function ko
        helper(matrix, n, m, xs + 1, ys, xd, yd, temp + 1, length, vis);
        helper(matrix, n, m, xs - 1, ys, xd, yd, temp + 1, length, vis);
        helper(matrix, n, m, xs, ys + 1, xd, yd, temp + 1, length, vis);
        helper(matrix, n, m, xs, ys - 1, xd, yd, temp + 1, length, vis);

        // Backtracking: Current cell ko unvisited mark karo
        vis[xs][ys] = false;
    }
}

        
