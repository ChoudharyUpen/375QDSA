public class GFG {
    static boolean findDuplicateparenthesis(String s) {
        Stack<Character> Stack = new Stack<>();
        // Convert String to Array: str = ['(', '(', 'a', '+', 'b', ')', ')']
        char[] str = s.toCharArray();
        for (char ch : str) {
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

