class Solution {
    public boolean isPalindrome(String s) {
         String cfinal = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
         int i=0;
         int j=cfinal.length()-1;
         while(i<j){
            if(cfinal.charAt(i)!=cfinal.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
            return true;
    }
}
