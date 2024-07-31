//gfg
//gfg solutions



class Solution{
    static boolean SolveSudoku(int grid[][])
    {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(grid, row, col, num)) {
                            grid[row][col] = num;
                            
                              // Recursive call: grid ko solve karne ke liye function ko firse call karte hain
                            // Agar recursion se true milta hai, iska matlab grid solve ho gaya hai
                            if (SolveSudoku(grid))
                                return true; // Agar poora grid valid hai, to true return karte hain
                            else {
                                // Agar recursive call se false milta hai, to current number sahi nahi hai
                                grid[row][col] = 0; // Backtrack karte hain, current cell ko 0 set karte hain
                            }
                        }
                    }
                     // Agar kisi bhi number se solution nahi milta, to return false
                    // Matlab current configuration se aage nahi badh sakte
                    return false;
                }
            }
        }
         // Agar sab cells fill ho gaye aur valid configuration mil gaya hai, to return true
        return true;
    }
    
    //Function to check if it's valid to put a number at the given position
    static boolean isValid(int[][] grid, int row, int col, int num) {
        // Check row
        for (int x = 0; x < 9; x++)
            if (grid[row][x] == num)
                return false;
        
        // Check column
        for (int x = 0; x < 9; x++)
            if (grid[x][col] == num)
                return false;
        
        // Check 3x3 box
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == num)
                    return false;
        
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " ");
            }
        }
    }
}
