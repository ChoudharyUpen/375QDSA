//Print Nth Fibonacci Numbers
public class q5 {
    public static int fib(int n) {
        //Base Case
        if (n == 0 || n==1) {
            return n;
        }
       int fnm1=fib(n-1);//1
       int fnm2=fib(n-2);//2
       int fn=fnm1+fnm2;
       return fn;
    }
    public static void main(String args[]) {
        int n = 6;
        //Sixth Fibonacci Number will be Printed
        System.out.println(fib(n));
        //Series of Fibonacci Numbers 
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }
}
