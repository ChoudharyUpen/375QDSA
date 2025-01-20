//best code than code below it 

//Steps in getAns method to calculate all possible path 
// Base Case
// Destination Check
// Mark Current Cell As Visited
// Recursive Calls (Explore All Directions)
// Backtrack




class Solution {
    void getAns(ArrayList<ArrayList<Integer>> mat,int r,int c,String path,ArrayList<String> al){
     
//      Base Case (Invalid Moves)
     
//      Agar koi bhi condition true hoti hai, toh wapas return karo:
// r < 0 || c < 0: Out of bounds (maze ke bahar gaya).
// r >= n || c >= n: Out of bounds (maze ke bahar gaya).
// mat.get(r).get(c) == 0: Blocked cell (chal nahi sakte).
// mat.get(r).get(c) == -1: Already visited cell.

      int n=mat.size();
        if(r<0 || c<0 || r>=n || c>=n || mat.get(r).get(c)==0 || mat.get(r).get(c)==-1){
            return;
        }
        // Destination Check
        // Agar destination (n-1, n-1) mil gaya, toh current path ko al me add karo aur return kar do.
        if(r==n-1 && c==n-1){
            al.add(path);
            return;
        }
        //Mark Current Cell as Visited
        mat.get(r).set(c,-1);
        //Recursive Calls (Explore All Directions)
        getAns(mat,r-1,c,path+"U",al);
        getAns(mat,r+1,c,path+"D",al);
        getAns(mat,r,c+1,path+"R",al);
        getAns(mat,r,c-1,path+"L",al);
        //Backtrack
        mat.get(r).set(c,1);
    }
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
         ArrayList<String> al=new ArrayList<>();
         String path="";
         getAns(mat,0,0,path,al);
         Collections.sort(al);
         return al;
    }
}















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
