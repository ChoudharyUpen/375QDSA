class Solution {
    public void reverseArray(int[] arr) {
       int n = arr.length;
       int temp = 0;
       for(int i=0;i<n/2;i++){
           temp = arr[i];
           arr[i] = arr[n-i-1];
           arr[n-i-1] = temp;
       }
    }
}
