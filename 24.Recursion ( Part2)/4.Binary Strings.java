public class q3 {
    private static void bstring(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        //str+"0" string k andar 0 add huva hai vo sirf agla level k liye add huva hai
        if (lastplace == 0) {
            bstring(n - 1, 0, str+"0");
            bstring(n - 1, 1, str+"1");
        } else {
            bstring(n - 1, 0,str+"0" );
        }}
    public static void main(String[] args) {
        bstring(3, 0, " ");
    }}
