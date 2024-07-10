class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> newq=new LinkedList<>();
        for(int i=0;i<k;i++){
           stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            newq.add(stack.pop());
        }
        while (!q.isEmpty()) {
              newq.add(q.remove());
        }
        return newq;
    }}
