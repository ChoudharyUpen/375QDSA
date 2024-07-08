class Solution {
    int maxRepeating(int[] arr, int n, int k) {
        int ans = arr[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(ans,1);
        for(int i=1;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            //agar ans mai jo value hai or usa humra current element bada hai 
            if(map.get(ans)<map.get(arr[i])){
                //tau answer update kar do
                ans = arr[i];
            }
            //for this case
            //N = 6, K = 3 Arr[] = {2, 2, 1, 0, 0, 1} Output: 0
            if(map.get(ans) == map.get(arr[i])){
                ans = Math.min(ans, arr[i]);
            }}
        return ans;
    }}
