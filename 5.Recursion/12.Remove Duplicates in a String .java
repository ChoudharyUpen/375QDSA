public class Q2 {
    public static void removveDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removveDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removveDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        removveDuplicates(str, 0, new StringBuilder(" "), new boolean[26]);
    }
}






















//Remove Duplicates in a String   
public class Q2 {
    public static void removveDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base Case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        // check
        //agar wo boolean map array mai true hai toh agaa bhad jo 
        if (map[currChar - 'a'] == true) {
            // duplicate
            removveDuplicates(str, idx + 1, newStr, map);
        } else {
             //agar wo boolean map array mai true nahi  hai usa true mark karo usa string mai jodo 
            or aga bhad jao
            map[currChar - 'a'] = true;
            removveDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        removveDuplicates(str, 0, new StringBuilder(" "), new boolean[26]);
    }

}
