import java.util.Stack;

// Java program to find duplicate parenthesis in a balanced expression
public class GFG {

    // Function duplicate parenthesis find karne ke liye
    static boolean findDuplicateparenthesis(String s) {
        // Character ka stack banao
        Stack<Character> Stack = new Stack<>();

        // Given expression ko iterate karo
        char[] str = s.toCharArray();
        for (char ch : str) {
            // Agar current character close parenthesis ')' hai
            if (ch == ')') {
                // Stack se character pop karo
                char top = Stack.peek();
                Stack.pop();

                // Ye count karta hai ki closing aur opening parenthesis ke beech kitne characters hain
                // Agar ye count 1 se kam ya barabar hai to brackets redundant hain
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            } else { // Open parenthesis '(', operators aur operands ko stack mein push karo
                Stack.push(ch);
            }
        }

        // Koi duplicates nahi mile
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        // Input balanced expression
        String str = "(((a+(b))+(c+d)))";

        if (findDuplicateparenthesis(str)) {
            System.out.println("Duplicate Found ");
        } else {
            System.out.println("No Duplicates Found ");
        }
    }
}








import java.util.Stack;

// Java program to find duplicate parenthesis in a 
// balanced expression 
public class GFG {

// Function to find duplicate parenthesis in a 
// balanced expression 
	static boolean findDuplicateparenthesis(String s) {
		// create a stack of characters 
		Stack<Character> Stack = new Stack<>();

		// Iterate through the given expression 
		char[] str = s.toCharArray();
		for (char ch : str) {
			// if current character is close parenthesis ')' 
			if (ch == ')') {
				// pop character from the stack 
				char top = Stack.peek();
				Stack.pop();

				// stores the number of characters between a 
				// closing and opening parenthesis 
				// if this count is less than or equal to 1 
				// then the brackets are redundant else not 
				int elementsInside = 0;
				while (top != '(') {
					elementsInside++;
					top = Stack.peek();
					Stack.pop();
				}
				if (elementsInside < 1) {
					return true;
				}
			} // push open parenthesis '(', operators and 
			// operands to stack 
			else {
				Stack.push(ch);
			}
		}

		// No duplicates found 
		return false;
	}

// Driver code 
public static void main(String[] args) {

		// input balanced expression 
		String str = "(((a+(b))+(c+d)))";

		if (findDuplicateparenthesis(str)) {
			System.out.println("Duplicate Found ");
		} else {
			System.out.println("No Duplicates Found ");
		}

	}
}
