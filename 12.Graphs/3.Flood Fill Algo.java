//learned from leetcode solution & chatgpt

class Solution {
    // Method to perform flood fill
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Agar image null hai ya image ki length 0 hai ya jo color hum change kar rahe hain woh pehle se hi given color se match karta hai, toh kuch nahi karna hai
        if (image == null || image.length == 0 || image[sr][sc] == color) {
            return image; // Return original image
        }

        int given = image[sr][sc]; // Initial color ko save kar rahe hain
        dfs(image, given, color, sr, sc); // Depth First Search (DFS) shuru kar rahe hain

        return image; // Updated image return kar rahe hain
    }

    // DFS function
    void dfs(int[][] image, int given, int color, int r, int c) {
        // Agar row ya column image ke boundary ke bahar ho
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) return;
        // Agar current cell ka color given color se match nahi karta ho
        if (image[r][c] != given) return;

        image[r][c] = color; // Current cell ka color change kar rahe hain

        // Recursively charo directions me DFS call kar rahe hain
        dfs(image, given, color, r + 1, c); // Neeche
        dfs(image, given, color, r - 1, c); // Upar
        dfs(image, given, color, r, c + 1); // Right
        dfs(image, given, color, r, c - 1); // Left
    }
}
