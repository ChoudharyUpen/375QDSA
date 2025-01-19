public class SumOfNaturalNumbers {
    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfN(n));
    }
}




































//Binary Strings Problem
//Print all binary strings of size N without consecutive ones.
// public class q4 {
//     public static void printBinStrings(int n, int lastPlace, String str) {
//         // base case
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }
//         // kaam
//         printBinStrings(n - 1, 0, str + "0");
//         if (lastPlace == 0) {
//             printBinStrings(n - 1, 1, str + "1");
//         }
//     }

//     public static void main(String[] args) {
//         printBinStrings(3, 0, " ");
//     }
// }
