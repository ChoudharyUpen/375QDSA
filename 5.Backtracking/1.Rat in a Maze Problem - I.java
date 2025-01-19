class Solution {
    static ArrayList<String> finalAns = new ArrayList<>();
    public ArrayList<String> findPath(int[][] a) {
        finalAns = new ArrayList<String>();
        boolean[][] visited = new boolean[a.length][a[0].length];
        helper(a, 0, 0, "", visited);
        return finalAns;
    }
    public static void helper(int[][] a, int row, int col, String ans, boolean[][] visited) {
        if(row < 0 || col < 0 || row > a.length-1 || col > a[0].length-1 || a[row][col] == 0 || visited[row][col] == true) {
            return ;
        }
        if(row == a.length-1 && col == a[0].length-1) {
            finalAns.add(ans);
            return;
        }
        visited[row][col] = true;
        helper(a, row-1, col, ans + "U", visited);
        helper(a, row, col-1, ans + "L", visited);
        helper(a, row+1, col, ans + "D", visited);
        helper(a, row, col+1, ans + "R", visited);
        visited[row][col] = false;
    }
}
















//gfg
//gfg solutions
class Solution {
    static ArrayList<String> finalAns = new ArrayList<>();
    public ArrayList<String> findPath(int[][] a) {
        finalAns = new ArrayList<String>();
        boolean[][] visited = new boolean[a.length][a[0].length];
        helper(a, 0, 0, "", visited);
        return finalAns;
    }
    public static void helper(int[][] a, int row, int col, String ans, boolean[][] visited) {
        // Agar row ya col bounds ke bahar ho, ya phir cell blocked ho (a[row][col] == 0), ya already visited ho, toh function return kar do.
        if(row < 0 || col < 0 || row > a.length-1 || col > a[0].length-1 || a[row][col] == 0 || visited[row][col] == true) {
            return ;
        }
        
        // Agar current cell bottom-right corner ho, toh current path (ans) ko finalAns mein add karo aur return kar do.
        if(row == a.length-1 && col == a[0].length-1) { //iska matalb hai final destination p puch gye
            finalAns.add(ans);
            return;
        }

        // Current cell ko visited mark kar do taki dubara visit na ho is path mein.
        visited[row][col] = true;

        // Charon directions mein move karo (up, left, down, right) aur path string (ans) mein direction add karo.
        helper(a, row-1, col, ans + "U", visited); // Up
        helper(a, row, col-1, ans + "L", visited); // Left
        helper(a, row+1, col, ans + "D", visited); // Down
        helper(a, row, col+1, ans + "R", visited); // Right

        // Sab directions explore karne ke baad, current cell ko unmark kar do (visited = false) taki doosre paths mein ye cell use ho sake.
        visited[row][col] = false; //use of backtracking is this line
    }
}
