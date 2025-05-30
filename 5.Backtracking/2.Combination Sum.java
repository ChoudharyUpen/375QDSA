total 5 cases are here ------
 1. Agar sum zero ho jaye to current combination ko result me add kar do   
 2.  Agar sum negative ho jaye to return kar do
3.  Duplicate values ko skip karne ke liye
4.  Agar current value sum se badi ho to break kar do
5.  Agar current value sum se choti ya barabar ho to combination me add karo


class Solution {
    static void combination(ArrayList<Integer> nums, int start, int sum, ArrayList<Integer> sub, ArrayList<ArrayList<Integer>> res) {
        //Base Conditions
        if (sum == 0) {
            res.add(new ArrayList<>(sub));
            return;
        }
        if (sum < 0) return;

        //Start Loop for Recursion
        for (int i = start; i < nums.size(); i++) {
            int val = nums.get(i);
            // Skip Duplicates
            if (i > start && val == nums.get(i - 1)) continue; 
            //Break if Value is Greater than Sum
            if (val > sum) break;
            if (val <= sum) {
                //Add Value to Current Combination
                sub.add(val);
                //Recursive Call
                combination(nums, i, sum - val, sub, res);
                //Backtrack
                sub.remove(sub.size() - 1);
            }
        }
    }
    
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        combination(A, 0, B, new ArrayList<>(), res);
        return res;
    }
}





















//gfg
//gfg solutions

total 5 cases are here ------
 1.  // Agar sum zero ho jaye to current combination ko result me add kar do   
 2.    // Agar sum negative ho jaye to return kar do
3.     // Duplicate values ko skip karne ke liye
4.  // Agar current value sum se badi ho to break kar do
5.    // Agar current value sum se choti ya barabar ho to combination me add karo


    
class Solution {
    static void combination(ArrayList<Integer> nums, int start, int sum, ArrayList<Integer> sub, ArrayList<ArrayList<Integer>> res) {
        // Agar sum zero ho jaye to current combination ko result me add kar do
        if (sum == 0) {
            res.add(new ArrayList<>(sub));
            return;
        }
        
        // Agar sum negative ho jaye to return kar do
        if (sum < 0) return;
        
        // Loop shuru karke nums array ko traverse karo
        for (int i = start; i < nums.size(); i++) {
            int val = nums.get(i);
            
            // Duplicate values ko skip karne ke liye
            if (i > start && val == nums.get(i - 1)) continue;
            
            // Agar current value sum se badi ho to break kar do
            if (val > sum) break;
            
            // Agar current value sum se choti ya barabar ho to combination me add karo
            if (val <= sum) {
                sub.add(val);
                combination(nums, i, sum - val, sub, res);  // Recursive call
                
                // Backtracking yahan use hota hai: last added element ko remove karte hain
             // list mai last added element ko remove karta hai taki or koi naya combination ban saka
                sub.remove(sub.size() - 1);
            }
        }
    }
    
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        // Array ko sort kar lo taaki combinations lexicographical order me mile
        Collections.sort(A);
        
        // Combination function ko initial parameters ke saath call karo
        combination(A, 0, B, new ArrayList<>(), res);
        
        return res;
    }
}
