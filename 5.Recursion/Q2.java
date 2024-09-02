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
        if (map[currChar - 'a'] == true) {
            // duplicate
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
