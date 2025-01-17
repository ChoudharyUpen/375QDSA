//thuis code is more easy then code below it

import java.util.*;

class Main {
    static int countnumber(int n) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        
        // Push all single-digit numbers to the stack
        for (int i = 1; i <= 9; i++) {
            stack.push(i);
            result++;
        }
        
        while (!stack.empty()) {
            int tp = stack.pop();
            
            // Generate the next number by appending digits
            for (int i = tp % 10; i <= 9; i++) {
                int x = tp * 10 + i;
                
                if (x <= n) {
                    stack.push(x);
                    result++;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String args[]) {
        int n = 15;
        System.out.println(countnumber(n)); // Expected output: Count of valid numbers
    }
}























import java.util.Stack; 
class GFG { 
static int countNumber(int n) { 
		int result = 0; 
		Stack<Integer> s = new Stack<>(); 
		for (int i = 1; i <= 9; i++) { 
			if (i <= n) { 
				s.push(i); 
				result++; 
			} 
			while (!s.empty()) { 
				int tp = s.pop(); 
				for (int j = tp % 10; j <= 9; j++) { 
					int x = tp * 10 + j; 
					if (x <= n) { 
						s.push(x); 
						result++; 
					}
				} 
			}
		} 
		return result; 
	} 
	public static void main(String[] args) { 
		int n = 15; 
		System.out.println(countNumber(n)); 
	}
} 
