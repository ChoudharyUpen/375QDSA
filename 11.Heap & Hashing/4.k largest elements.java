//Leetcode
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

    
class Solution {
    //this question will be solved with the help of Priority Queue
    int[] kLargest(int[] arr, int n, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add first k elements to the priority queue
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        
        // Process the rest of the elements
        for (int i = k; i < n; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();  // Use poll() to remove the smallest element
                pq.add(arr[i]);
            }
        }
        
        // Extract elements from the priority queue into the result array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }
        
        return result;
        
       
    }
}
