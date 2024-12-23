//Date: 23-12-2024 this is the code newly updated before when i did it it was downside 
class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentInterval[1] >= arr[i][0]) {
                currentInterval[1] = Math.max(currentInterval[1], arr[i][1]);
            } else {
                result.add(currentInterval);
                currentInterval = arr[i];
            }
        }
        result.add(currentInterval);
        return result;
    }
}



//Good Question Pratice this 
//i learned this fromm chatgpt on 8-12-2024 now revise this and other question so much that you dont have to revise anything this again

class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
       //This Line sort the Array it compare a and b and it contain 
       // a lambda expression
       Arrays.sort(Intervals,(a,b)-> Integer.compare(a[0],b[0]));
       int res=0;
        // Check: 3 >= 2 (Overlap hai)
       for(int i=1;i<Intervals.length;i++){
           if(Intervals[res][1]>=Intervals[i][0]){
               // Merge:
               // start = min(1,3) = 1
               // end = max(2,6) = 6
               Intervals[res][0]=Math.min(Intervals[res][0],Intervals[i][0]);
               Intervals[res][1]=Math.max(Intervals[res][1],Intervals[i][1]);
           }
           else{
               res++;
               //No Merge:
               // res++ = 2
               // Intervals[res] = [15,18]
               Intervals[res][0]=Intervals[i][0];
               Intervals[res][1]=Intervals[i][1];
           }
       }
       return Arrays.copyOfRange(Intervals,0,res+1);
    }
}
