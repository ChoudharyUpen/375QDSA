//learned from yogesh & shailesh channel
//very easy
//gfg
class Solution {
    void dfs(int i,int j,int m,int n,char[][] grid){
        //Base Case ---- Boundary ka bhar hai tau retrun kar jo
        if(i<0||i>=m||j<0||j>=n||grid[i][j]=='0')
            return;
        //Recursion call for all 8 directions
        grid[i][j]='0';
        dfs(i+1,j,m,n,grid);
        dfs(i-1,j,m,n,grid);
        dfs(i,j+1,m,n,grid);
        dfs(i,j-1,m,n,grid);
        dfs(i-1,j-1,m,n,grid);
        dfs(i+1,j+1,m,n,grid);
        dfs(i+1,j-1,m,n,grid);
        dfs(i-1,j+1,m,n,grid);
    }
    
    
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
//         m is the number of rows in the grid.
// n is the number of columns in the grid.
        int m=grid.length;
        int n=grid[0].length;
        
        int count=0;
        //traverse
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                //if agar grid ki value 1 hai tabhi 
                //dfs ko call lago or count ki value ++
                if(grid[i][j]=='1'){
                    dfs(i,j,m,n,grid);
                    count++;
                }
            }
        }
        return count;
    }
}
