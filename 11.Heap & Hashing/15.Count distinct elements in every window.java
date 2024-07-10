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


