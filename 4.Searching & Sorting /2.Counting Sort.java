
class Solution{
    public static String countSort(String arr){
        char[] temp = arr.toCharArray();
        Arrays.sort(temp);
        String ans = new String(temp);
        return ans;
    }
}
