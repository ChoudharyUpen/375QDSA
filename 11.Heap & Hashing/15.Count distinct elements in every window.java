//gfg

Input:
N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
Output: 3 4 4 3
Explanation: 

Window 1 of size k = 4 is
1 2 1 3. Number of distinct elements in
this window are 3. 
    
Window 2 of size k = 4 is 2 1 3 4. Number
of distinct elements in this window are 4.
    
Window 3 of size k = 4 is 1 3 4 2. Number
of distinct elements in this window are 4.
    
Window 4 of size k = 4 is 3 4 2 3. Number
of distinct elements in this window are 3.



    
class Solution {
    ArrayList<Integer> countDistinct(int a[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        // Initialize the map with the first 'k' elements
        for (int i = 0; i < k; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        
        // Add the size of the map (distinct count) to the result
        result.add(map.size());
        
        // Iterate over the rest of the array
        for (int i = k; i < n; i++) {
            // Remove the (i-k)th element from the map
            if (map.get(a[i - k]) == 1) {
                map.remove(a[i - k]);
            } else {
                map.put(a[i - k], map.get(a[i - k]) - 1);
            }
            
            // Add the current element to the map
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            
            // Add the size of the map (distinct count) to the result
            result.add(map.size());
        }
        
        return result;
    }
}


