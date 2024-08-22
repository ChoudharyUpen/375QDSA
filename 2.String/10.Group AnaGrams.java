//Leetcode 
//Leetcode solution + my approach was correct only that i could not write code 
// //this question was of easy type my approach was also correct  mistake wa only that i was not giving my 100% effort to attempt 
// and did not have believe in me that i can do this question 


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}


// class Solution {
//     List<List<String>> ans;
//     public List<List<String>> groupAnagrams(String[] strs) {
//      ans = new ArrayList<>();
//         String[] sortedStrings = new String[strs.length];
//         for (int i = 0; i < strings.length; i++) {
//             char[] chars = strings[i].toCharArray();  
//             Arrays.sort(chars); 
//             sortedStrings[i] = new String(chars); 
//         }
//        for (int i = 0; i <  sortedStrings.length; i++) {
//         if(){
//         ans.get(i).add();
//      }
//         }

//         return ans;

//     }
// }
