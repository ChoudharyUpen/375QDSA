// Use Of MOD
// Pehle, 2 ko 10 se multiply karo: 2 * 10 = 20
// Ab isme 1 add karo: 20 + 1 = 21
// Phir MOD lagao: 21 % 1000000007 = 21
// Yahaan 21 waise toh chhota number hai, lekin agar bohot bada number 
// hota toh MOD lagane ke baad jo remainder milta, woh relatively chhota hota, 
// jo computer easily handle kar leta.

class Solution {
    static final long MOD = 1000000007;

    public long multiplyTwoLists(Node first, Node second) {
        long num1 = 0;
        long num2 = 0;

        // Convert the first linked list to a number with modulo operation
        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }

        // Convert the second linked list to a number with modulo operation
        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }

        // Multiply the two numbers and take modulo to handle large results
        return (num1 * num2) % MOD;
    }
}
