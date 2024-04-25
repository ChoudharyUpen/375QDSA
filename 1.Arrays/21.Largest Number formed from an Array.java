class Solution {
    String printLargest(int n, String[] arr) {
      /*this line is most important in this program this line compare two (a, b)
      on the basis of (a + b).compareTo(b + a)
        */
        Arrays.sort(arr, (a, b) -> ((a + b).compareTo(b + a)));
        String a="";
        for(int i=n-1;i>=0;i--){
            a+=arr[i];
        }
        return a;
    }
}
