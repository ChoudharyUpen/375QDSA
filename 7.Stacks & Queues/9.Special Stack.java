class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
    {
        return s.pop();
	}
	public int min(Stack<Integer> s)
    {
        int min = Integer.MAX_VALUE;
        while(!s.isEmpty()){
            min = Math.min(min,s.peek());
            s.pop();
        }
        return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
    {
       return s.size()>=n ? true : false;
	}
	public boolean isEmpty(Stack<Integer>s)
    {
        return s.isEmpty();
	}
}
