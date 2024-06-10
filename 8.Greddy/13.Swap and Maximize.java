// Approach:
// Sorting: Pehle array ko sort kiya jata hai.
// Alternating Order Fill: Ek naye array ko alternate order mein fill kiya jata hai, jahan even indices mein chhoti values aur odd indices mein badi values fill hoti hain.
// Calculating Differences: Consecutive elements ke beech ka maximum absolute difference calculate kiya jata hai aur final sum return kiya jata hai.

class GFG
{
    long maxSum(long arr[] ,int n)
    {
        //Step 1 Sort the Array
          Arrays.sort(arr);//1,2,4,8
        //Step 2Ek nayi array newArray banayi gayi
        //hai jo same size ki hai arr jaisi.
         long[] newArray = new long[n];
         
         //Step3 Filling the New Array:
         //jahan even indices mein chhoti 
         //values aur odd indices mein badi values
         for(int i=0;i<n;i++){
        if(i%2==0){
            newArray[i]=arr[i/2];//1,8,2
        }else{
            newArray[i]=arr[n-(i+1)/2];//1,8,2,4
        }
    }
    //Step3 Calculating the Maximum Sum:
      long ans=0;
    for(int i=0;i<n-1;i++){
        ans=ans+ Math.abs(newArray[i]-newArray[i+1]);
    }
    //and mai 0 or 1 ka bhi absolute differnce  nikal lo
    ans+= Math.abs(newArray[n-1]-newArray[0]);
        
    return ans;
    }
}
