class Solution {
    int minDiff(int[] arr, int k, int m, int th) {
        Arrays.sort(arr); // Step 1: Sort the array
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        int count = 0; // Track numbers >= th in the window

        // Step 2: Count the initial window (first `k` elements)
        for (int i = 0; i < k; i++) {
            if (arr[i] >= th) {
                count++;
            }
        }

        // Step 3: If the initial window is valid, calculate the min difference
        if (count >= m) {
            minDiff = arr[k - 1] - arr[0];
        }

        // Step 4: Use sliding window to check remaining windows efficiently
        for (int i = 1; i <= n - k; i++) {
            // Remove the element going out of the window
            if (arr[i - 1] >= th) {
                count--;
            }

            // Add the new element coming into the window
            if (arr[i + k - 1] >= th) {
                count++;
            }

            // Only update minDiff if the current window is valid
            if (count >= m) {
                minDiff = Math.min(minDiff, arr[i + k - 1] - arr[i]);
            }
        }

        // Step 5: If no valid selection found, return -1
        return (minDiff == Integer.MAX_VALUE) ? -1 : minDiff;
    }
}
