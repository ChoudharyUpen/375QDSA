//Print Factorial of a number n
public class q3 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        //5 sa 1 tak ka sara number is ma aa jayenge
        // int fnm1 = factorial(n - 1);
        //un sara numbers ko bari bari sa multiply kar denge
        int fn = n * factorial(n - 1);
        return fn;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(factorial(n));
    }
}