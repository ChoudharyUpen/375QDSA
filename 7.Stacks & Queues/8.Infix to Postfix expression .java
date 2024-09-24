public class InfixToPostfix {
	// Yeh function operators ka precedence (importance) decide karta hai
	static int prec(char c) {
		if (c == '^')
			return 3;
		else if (c == '/' || c == '*')
			return 2;
		else if (c == '+' || c == '-')
			return 1;
		else
			return -1;
	}

	// Yeh function check karta hai ki operator left-associative hai ya right-associative.
	static char associativity(char c) {
		if (c == '^')
			return 'R';
		return 'L'; // Default to left-associative
	}

	// Yeh main function hai jo infix ko postfix mein convert karta hai.
	static void infixToPostfix(String s) {
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// If the scanned character is an operand, add it to the output string.
			//Agar koi character ya number aya hai toh sedha stack mai add kar do
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
				result.append(c);
			}
			// If the scanned character is an ‘(‘, push it to the stack.
			else if (c == '(') {
				stack.push(c);
			}
			// If the scanned character is an ‘)’, pop and add to the output string from the stack
			// until an ‘(‘ is encountered.
			else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result.append(stack.pop());
				}
				stack.pop(); // Pop '('
			}
			// If an operator is scanned (Agar Operator ata hai toh ye karna hai 
			else {
				while (!stack.isEmpty() && (prec(s.charAt(i)) < prec(stack.peek()) ||
											prec(s.charAt(i)) == prec(stack.peek()) &&								associativity(s.charAt(i)) == 'L')) {
					result.append(stack.pop());
				}
				stack.push(c);
			}
		}
		// Pop all the remaining elements from the stack
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}
		System.out.println(result);
	}
}
Agar hum associativity(s.charAt(i)) == 'L' wali line code se hata denge, toh kuch cases mein expression ka postfix conversion galat ho sakta hai, especially right-associative operators ke liye, jaise exponentiation operator (^).
Finally, stack ka ^ result mein add ho jayega: result = "ab^c^"  wrong answer without using associativity(s.charAt(i)) == 'L'

Iska result galat hoga, kyunki a ^ (b ^ c) ki jagah yeh (a ^ b) ^ c ko represent kar raha hai.

	
Agar hum associativity(s.charAt(i)) == 'L' wali line use karte hain, toh a ^ (b ^ c) expression ka sahi postfix conversion hoga. 
abc^^

	
c = '^' (operator):

Check the top of the stack:
Precedence of ^ (3) is equal to precedence of ^ (3).
Associativity of ^ is 'R' (right-associative), so do not pop the stack.
Push ^ to stack: stack = ['^', '^']
