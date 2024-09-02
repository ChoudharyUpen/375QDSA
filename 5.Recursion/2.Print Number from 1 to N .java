//Print Numbers in Increasing Order
public class q2 {
    public static void increasing(int n) {
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
         //using recursion
         increasing(n-1);
        System.out.println(n+" ");
       
    }
    public static void main(String args[]){
        int n=10;
        //is ko call kiya
        increasing(n);
    }
}
