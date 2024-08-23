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
