import java.io.*;
import java.util.*;
class MyStack {
	Stack<Integer> s;
	Deque<Integer> dq;

	MyStack()
	{
		s = new Stack<Integer>();
		dq = new ArrayDeque<Integer>();
	}
	void add(int data)
	{
		dq.addLast(data);
		if (dq.size() > s.size() + 1) {
			int temp = dq.pollFirst();
			s.push(temp);
		}
	}
	void pop()
	{
		int data = dq.pollLast();
		if (s.size() > dq.size()) {
			int temp = s.pop();
			dq.offerFirst(temp);
		}
	}
	int getMiddleElement() { return dq.getFirst(); }
  
	void deleteMiddleElement()
	{
		dq.pollFirst();
		if (s.size() > dq.size()) {
			int temp = s.pop();
			dq.offerFirst(temp);
		}
	}
}
class GFG {
	public static void main(String[] args)
	{
		MyStack s = new MyStack();
		s.add(2);
		s.add(5);

		System.out.println("Middle element:"+ s.getMiddleElement());
		s.add(3);
		s.add(7);
		s.add(4);
		System.out.println("Middle element:"+ s.getMiddleElement());
		s.deleteMiddleElement();
    
		System.out.println("Middle element:"+ s.getMiddleElement());
		s.deleteMiddleElement();
    
		System.out.println("Middle element:"+ s.getMiddleElement());
		s.pop();
		s.pop();
		s.deleteMiddleElement();
	}
}
