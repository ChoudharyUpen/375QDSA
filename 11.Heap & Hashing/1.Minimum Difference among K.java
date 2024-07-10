//this is the updated solution for this question
//from chatgpt
//learned when doing coding tak tak
class Solution{
    long minDiff(long a[] ,int N,int K){
     Arrays.sort(a);
        long minDiff = Long.MAX_VALUE;
        for (int i = 0; i <= N - K; i++) {
            // Find the difference between the maximum and minimum in the current window of size K
            long diff = a[i + K - 1] - a[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
}



//this was the previous code 

// class Solution{
//     long minDiff(long a[] ,int N,int K){
//         //Step1 Array ko sort kar liya
//         Arrays.sort(a);
//         //Step2 ek minimum or maximum value le le
//         long min = Long.MAX_VALUE;
//         long max = Long.MIN_VALUE;
        
//         //Step3 Ab pura Array ko traverse kar k minimum or 
//         //maxmum value nikal lenge
//         for(int i = 0;i<K;i++){
//             min = Math.min(a[i], min);
//             max = Math.max(a[i], max);
//         }
//         //Step4 Dono ka differnce nikal liya
//         long dif = (max - min);
        
//         // window
//         int start = 1;
//         int end = K; //for example 1 its 3 

// //3 to last means 7    on first trasversal 3 then 4,5,6,7
//         while(end < a.length){
//             //taking maximuma and minimum value
//             long maximum = a[end];
//             long minimun = a[start];
//             //subtracting them and finding some value
//             long abs = Math.abs(minimun - maximum);
//             //finding the differnce if its lower replacing it
//             dif = Math.min(abs, dif);

//             end++;
//             start++;
//         }
//         //finally returning the final answer
//         return dif;
//     }
// }
