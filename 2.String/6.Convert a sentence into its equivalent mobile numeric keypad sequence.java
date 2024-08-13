//gfg
//gfg solutions
class Solution { 
    String printSequence(String S) { 
        if(S.length() ==0) return "";
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<S.length();i++){
            char curr = S.charAt(i);
            ans.append(keypad(curr));
        }
        return ans.toString();
    }
    public static String  keypad(char ch){
        Map<Character,String> key = new HashMap<>();
        key.put(' ',"0");
        key.put('A',"2");
        key.put('B',"22");
        key.put('C',"222");
        key.put('D',"3");
        key.put('E',"33");
        key.put('F',"333");
        key.put('G',"4");
        key.put('H',"44");
        key.put('I',"444");
        key.put('J',"5");
        key.put('K',"55");
        key.put('L',"555");
        key.put('M',"6");
        key.put('N',"66");
        key.put('O',"666");
        key.put('P',"7");
        key.put('Q',"77");
        key.put('R',"777");
        key.put('S',"7777");
        key.put('T',"8");
        key.put('U',"88");
        key.put('V',"888");
        key.put('W',"9");
        
        key.put('X',"99");
        key.put('Y',"999");
        key.put('Z',"9999");
        return key.get(ch);
    }
}
// class Solution { 
//     String printSequence(String S) 
//     { 
//         String ans="";
//         for(int i=0;i<S.length();i++){
//             String a=S.charAt(i);
//             if(a == 'A'){
//                 ans= ans+2;
//             }
//             else if(a == 'B'){
//                 ans= ans+2;
//                 ans= ans+2;
//             }
//              else if(a == 'C'){
//                 ans= ans+2;
//                 ans= ans+2;
//                 ans= ans+2;
//             }
//         }
//     }
// }
