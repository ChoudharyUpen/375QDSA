class Solution{
    public static int evaluatePostFix(String S){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
           // 2 he option ho sakhta hai ya toh wo number ho ya wo digit ho 
            char c = S.charAt(i);
         
            if (Character.isDigit(c)) {
                stack.push(c - '0'); //Ye line digit ko integer mein convert karke stack mein daal rahi hai.
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
        return stack.pop();
    }}
