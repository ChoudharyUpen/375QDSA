class GfG {
    
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        //ye stack jis ma value dalenge 
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<k;i++){
            stack.push(q.poll());
            
        }
         // Create a new queue to hold the reversed elements
         Queue<Integer> reversedQueue=new LinkedList<>();
         
         while(!stack.isEmpty()){
              reversedQueue.offer(stack.pop());
         }
         
         
         while(!q.isEmpty()){
             reversedQueue.offer(q.poll());
         }
         
          // Return the reversed queue
        return reversedQueue;
    }
}
