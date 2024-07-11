//Gfg
Examples

Input: arr[] = [1 3 2 4], n = 4
Output: 3 4 4 -1
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, 
since it doesn't exist, it is -1.
    
Dry Run of the Code -------
Certainly! Here’s a more concise dry run for the input arr = [1, 3, 2, 4] and n = 4:

Initialize: ss = [], nums = [-1, -1, -1, -1].
1.i = 0: arr[0] = 1. Push 0 to ss → ss = [0].
2.i = 1: arr[1] = 3. arr[1] > arr[0], so nums[0] = 3. 
Pop 0 from ss → ss = []. Push 1 → ss = [1].
3.i = 2: arr[2] = 2. Push 2 to ss → ss = [1, 2].
4.i = 3: arr[3] = 4. arr[3] > arr[2], so nums[2] = 4. 
Pop 2 from ss → ss = [1]. arr[3] > arr[1], so nums[1] = 4. Pop 1 from ss → ss = []. 
Push 3 → ss = [3].
5.End: ss has 3, no next greater element for arr[3].
6.Result: nums = [3, 4, 4, -1].
Final output: [3, 4, 4, -1].




    
class Solution{
  
    public static long[] nextLargerElement(long[] arr, int n)
    { 
 
    Stack<Integer> ss = new Stack<>();
    //Creating a Array of types Long Which We Will Return 
    long[] nums = new long[n];
    //Filling nums array with -1 beacuse it will help as in last element 
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
