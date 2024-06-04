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
