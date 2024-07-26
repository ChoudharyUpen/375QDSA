class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        //Step 1 ek Stack bano
          Stack<Integer> stack = new Stack<>();
        int j = 0; // pointer for output array

        // Traverse the input array
        for (int i = 0; i < n; i++) {
            // Push the current element to the stack
            stack.push(ip[i]);

            // Check the top of the stack against the current element in the output array
            while (!stack.isEmpty() && stack.peek() == op[j]) {
                stack.pop();
                j++;
            }
        }
        // If the stack is empty, then the output array is a valid stack permutation of the input array
        return stack.isEmpty() ? 1 : 0;
    }
}
