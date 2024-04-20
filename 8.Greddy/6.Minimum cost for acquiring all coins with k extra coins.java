import java.util.Arrays; 
class Main{
    static int minCost(int coin[],int n, int k) 
    { 
        Arrays.sort(coin);
        int a=n/k;
        int count=0;
        for(int i=0;i<a;i++){
            count+=coin[i];
        }
          return count;
    }
    public static void main(String arg[]) 
    { 
        int coin[] = { 8, 5, 3, 10,  2, 1, 15, 25 }; 
        int n = coin.length; 
        int k = 3; 
        System.out.print(minCost(coin, n, k)); 
    } 
}
