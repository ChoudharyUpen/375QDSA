
class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int steps = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean visited[][] = new boolean[n][n];

        // Add the initial position
        q.add(1);
        visited[n-1][0] = true;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int x = q.poll();
                if (x == n * n) return steps; // If reached the last cell

                for (int k = 1; k <= 6; k++) {
                    if (k + x > n * n) break;
                    int pos[] = findCoordinates(k + x, n);
                    int r = pos[0];
                    int c = pos[1];

                    if (visited[r][c]) continue; // Check if already visited
                    visited[r][c] = true; // Mark as visited

                    if (board[r][c] == -1) {
                        q.add(k + x); // Add the current cell
                    } else {
                        q.add(board[r][c]); // Add the cell pointed to by the snake/ladder
                    }
                }
            }
            steps++;
        }
        return -1; // If the board is unsolvable
    }

    public int[] findCoordinates(int curr, int n) {
        int r = n - (curr - 1) / n - 1;
        int c = (curr - 1) % n;
        if (r % 2 == n % 2) {
            return new int[]{r, n - 1 - c}; // Reverse the column for odd rows
        } else {
            return new int[]{r, c}; // Keep the column for even rows
        }
    }
}





//leetcode
//code inspired from codebix youtube channel
