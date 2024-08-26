class Solution{
    static boolean match(String wild, String pattern)
    {
        String ans ="";
       for(int i=0;i<wild.length();i++){
           if(wild.charAt(i)=='*'){
               ans=ans+"[a-zA-A]*";
           }else if(wild.charAt(i)=='?'){
               ans=ans+".";
           }else{
               ans=ans+wild.charAt(i);
           }
       }
        return pattern.matches(ans);
    }
}











// class Solution{
//     static boolean match(String wild, String pattern)
//     {
//          // Use StringBuilder to modify the string
//         StringBuilder modifiedWild = new StringBuilder(wild);
//         for(int i=0;i<pattern.length();i++){
//             if(wild.charAt(i)!=pattern.charAt(i)){
//                 if(i==pattern.length()-1){
//                     // add reamining character from string
//                     //new learn
//                     modifiedWild.append(pattern.substring(wild.length()));
//                 }
//                 //new learn
//              else if (modifiedWild.charAt(i) == '*' || modifiedWild.charAt(i) == '?') {
//                 // Replace '*' or '?' with the corresponding character from pattern
//                 modifiedWild.setCharAt(i, pattern.charAt(i));
//             }
//             }
//         }
//          String str = modifiedWild.toString();
//         if(str==pattern){
//             return "YES";
//         }
//         return "NO";
//     }
// }
