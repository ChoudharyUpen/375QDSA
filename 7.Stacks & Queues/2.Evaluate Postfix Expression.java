class Solution{
    public static int evaluatePostFix(String S){
        Stack<Integer> stack = new Stack<>();
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
                }}}
        //Final answer ko return kar do sare operation ho jane k baad
        return stack.pop();
    }}
