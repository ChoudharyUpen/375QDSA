class Solution {
    int longSubarrWthSumDivByK(int[] a, int k) {
        int sum = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            int rem = sum%k;
            if(rem == 0) maxLen = Math.max(maxLen, i+1);
            if(rem < 0) rem = rem + k;
            if(map.containsKey(rem)){ 
                //subarray ko check kar rha hai present - phela jo element aya tha usko minus kar ka 
                maxLen = Math.max(i-map.get(rem), maxLen);    
            }
            else{
                 map.put(rem, i);
                }
        }
        return maxLen;
    }
}
