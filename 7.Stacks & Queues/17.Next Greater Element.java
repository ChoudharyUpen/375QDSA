
//this code is the updated code of the following question because they have changed return value 
class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length; // Length of the input array
        Stack<Integer> ss = new Stack<>(); // Stack to keep indices
        int[] nums = new int[n]; // Array to store results
        Arrays.fill(nums, -1); // Initialize the result array with -1 (default)

        for (int i = 0; i < n; i++) {
            // While stack is not empty and current element is greater than element at stack's top index
            while (!ss.isEmpty() && arr[ss.peek()] < arr[i]) {
                nums[ss.pop()] = arr[i]; // Update the result for the index at stack's top
            }
            ss.push(i); // Push the current index onto the stack
        }

        // Convert the result array to ArrayList<Integer> and return
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(num);
        }
        return result;
    }
}





class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
         // Your code here
    Stack<Integer> ss = new Stack<>();
    long[] nums = new long[n];
    Arrays.fill(nums, -1);
    
    for (int i = 0; i < n; i++) {
        // Pop elements from the stack while the current element is greater
        // than the element represented by the index at the top of the stack
        while (!ss.isEmpty() && arr[ss.peek()] < arr[i]) {
            nums[ss.pop()] = arr[i];
        }
        // Push the current index onto the stack
        ss.push(i);
    }
    
    return nums;
    } 
}
