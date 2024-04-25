class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
       //This Line sort the Array it compare a and b and it contain 
       // a lambda expression
       Arrays.sort(Intervals,(a,b)-> Integer.compare(a[0],b[0]));
       int res=0;
       for(int i=1;i<Intervals.length;i++){
           if(Intervals[res][1]>=Intervals[i][0]){
               Intervals[res][0]=Math.min(Intervals[res][0],Intervals[i][0]);
               Intervals[res][1]=Math.max(Intervals[res][1],Intervals[i][1]);
           }
           else{
               res++;
               Intervals[res][0]=Intervals[i][0];
               Intervals[res][1]=Intervals[i][1];
           }
       }
       return Arrays.copyOfRange(Intervals,0,res+1);
    }
}
