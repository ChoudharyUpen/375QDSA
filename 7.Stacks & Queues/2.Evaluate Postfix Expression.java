class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        //ek stack bana liye jiska andar value store karwange
        Stack<Integer> stack = new Stack<>();

       //ab loop chalenge pura string pa bari bari se
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
          //check karenge kya vo digit hai agar hai tau stack mai push kar do
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to integer
            } else {
              //agar digit nahi hai tau last 2 value of stack nikal k un pai operation perform kar do
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
