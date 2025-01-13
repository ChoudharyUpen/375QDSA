//i think below code is more easy than this code 
class Solution {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                int flag  = 0;

                    while(stack.peek() != '('){
                        if(stack.peek() == '+' || stack.peek() == '*' || stack.peek() == '*' || stack.peek() == '-' || stack.peek() == '/') {
                            flag = 1;
                        }
                        stack.pop();
                    }
                    stack.pop();

                   //flag 0 or 1 is like elementinside 0 or 1
                    if(flag == 0){
                        return 1;
                    }
            }
            else{
                stack.push(ch);
            }
        }
        return 0;
    }
}


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

