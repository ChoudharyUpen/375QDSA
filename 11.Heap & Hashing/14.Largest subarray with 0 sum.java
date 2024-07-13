//gfg
Input: arr[] = {15,-2,2,-8,1,7,10,23}, n = 8
Output: 5
Explanation: The largest subarray with sum 0 is -2 2 -8 1 7.
    
Input: arr[] = {2,10,4}, n = 3
Output: 0
Explanation: There is no subarray with 0 sum.



class GfG{
    //nishant chahr used same approach as me but i was not sure whether this is the ciorrect approach or not
    int maxLen(int arr[], int n){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0, ans = 0;
        mp.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (mp.containsKey(sum)) {
                ans = Math.max(ans, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }}
        return ans;
    }}
