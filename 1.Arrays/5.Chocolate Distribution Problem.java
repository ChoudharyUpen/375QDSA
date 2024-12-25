//this solution is better and easy then solution given below it this solution does not use sliding window approach 
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        int n = arr.size();  // Use size() instead of length
        Collections.sort(arr);  // Correct the variable name to 'arr'
        int ans = Integer.MAX_VALUE;  // Use int since we're working with differences
        
        for (int i = 0; i < n - m + 1; i++) {
            int j = i + m - 1;  
            
            if (arr.get(j) - arr.get(i) < ans)
                ans = arr.get(j) - arr.get(i);
        }
        
        return ans;
    }
}





//sliding window is being used in this question 
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        // Step 3: Sliding window approach ka use karte hain.
        for(int i = m - 1; i < arr.size(); i++) {
            // Current subset ka max (arr[i]) aur min (arr[i-m+1]) ka difference nikalte hain.
            int diff = arr.get(i) - arr.get(i - m + 1);
            min = Math.min(min, diff);
        }
        return min; 
    }
}
