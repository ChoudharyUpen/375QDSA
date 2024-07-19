//Leetcode
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

    //this is the easy solution then the code given downwards
    class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Initialize an empty list
        PriorityQueue<Integer> kNumbersMinHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

        // Add first k elements to the list
        for (int i = 0; i < k; i++) {
            kNumbersMinHeap.add(nums[i]);
        }

        // Loop through the remaining elements in the 'nums' array
        for (int i = k; i < nums.length; i++) {
            // Compare the current element with the minimum
            // element (root) of the min-heap
            if (nums[i] > kNumbersMinHeap.peek()) {
                // Remove the smallest element
                kNumbersMinHeap.poll();
                // Add the current element
                kNumbersMinHeap.add(nums[i]);
            }
        }

        // The root of the heap has the Kth largest element
        return kNumbersMinHeap.peek();
    }
}
    
// class Solution {
//     //this question will be solved with the help of Priority Queue
//     int[] kLargest(int[] arr, int n, int k) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
//         // Add first k elements to the priority queue
//         for (int i = 0; i < k; i++) {
//             pq.add(arr[i]);
//         }
        
//         // Process the rest of the elements
//         for (int i = k; i < n; i++) {
//             if (pq.peek() < arr[i]) {
//                 pq.poll();  // Use poll() to remove the smallest element
//                 pq.add(arr[i]);
//             }
//         }
        
//         // Extract elements from the priority queue into the result array
//         int[] result = new int[k];
//         for (int i = k - 1; i >= 0; i--) {
//             result[i] = pq.poll();
//         }
        
//         return result;
        
       
//     }
// }
