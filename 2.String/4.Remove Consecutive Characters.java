//byself
//gfg
class Solution{
    public String removeConsecutiveCharacter(String S){
        String a="";
        a=a+ S.charAt(0);
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                a=a+ S.charAt(i);
            }
        }
        return a;
    }
}
