//GFG
Example 1:
Input:
N = 4, K = 3  Arr[] = {2, 2, 1, 2}
Output: 2
Explanation: 2 is the most frequent element.
    
Example 2:
(This Example is v.imp leads to corner case)
Input: 
N = 6, K = 3 Arr[] = {2, 2, 1, 0, 0, 1}
Output: 0
Explanation: 0, 1 and 2 all have same
frequency of 2.But since 0 is smallest,
you need to return 0.

    
class Solution {
    int maxRepeating(int[] arr, int n, int k) {
        //arr[0]=2;
        int ans = arr[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        //put arr[0]=2 with frequency 1
        map.put(ans,1);
        for(int i=1;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            
            //agar ans mai jo value hai or usa humra current element bada hai 
            // if True update maximum repeating number based on there frequency
            
            if(map.get(ans)<map.get(arr[i])){
                //tau answer update kar do
                ans = arr[i];
            }
            
            //for this case
            //Agar dono ki frequency barabar hai tau usma jo chota hai uski value return karenge 
            //N = 6, K = 3 Arr[] = {2, 2, 1, 0, 0, 1} Output: 0
            if(map.get(ans) == map.get(arr[i])){
                ans = Math.min(ans, arr[i]);
            }}
        return ans;
    }}
