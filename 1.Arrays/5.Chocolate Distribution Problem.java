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
