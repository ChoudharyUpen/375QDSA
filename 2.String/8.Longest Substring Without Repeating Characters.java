//leetcode
//leetcode solutions
//sliding window will be used in this 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);  
            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            } 
        }
        return maxLength;
    }
}






// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int count=0;
//         int curr=0;
//            HashSet<String> set = new HashSet<>();
//            for(int i=0;i<s.length();i++){
//             curr++;
//             if (set.contains(String.valueOf(s.charAt(i)))) {
//     set.clear();
//     curr=0;
//     if(count<curr){
//         count =curr;
//     }
// }
//             else{
//                set.add(String.valueOf(s.charAt(i)));
//                 count+=1;
//             }
//            }return count;
//     }
// }
