//gfg
//gfg solutions

class Solution{
    //in this function dp is used will learn this when doing dp
    static boolean check(int n,int[] arr,int sum,boolean[][] dp){
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    static int equalPartition(int n, int arr[])
    {
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        if(sum%2!=0){
            return 0;
        }
        else{
            sum/=2;
            boolean[][] dp=new boolean[n+1][sum+1];
            for(int i=0;i<n;i++){
                dp[i][0]=true;
            }
            return check(n,arr,sum,dp)?1:0;
        }
    }
}
