class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
       //ek STack bana lo jis ma value dalo ga 
       Stack<Integer> stack = new Stack<>();
         // Dequeue elements from the queue and push them onto the stack
        while (!q.isEmpty()) {
            stack.push(q.poll());
            
        }
          // Create a new queue to hold the reversed elements
        Queue<Integer> reversedQueue = new LinkedList<>();
        // Print the elements of the stack
       
        while (!stack.isEmpty()) {
           reversedQueue.offer(stack.pop());
        }
         // Return the reversed queue
        return reversedQueue;
    }
}
