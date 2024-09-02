//Print x to the Power n(Optimized)
public class q10 {
    public static int optimizedPower(int a, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));

    }

}
