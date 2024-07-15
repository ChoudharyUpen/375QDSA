

class Solution
{
    public String FirstNonRepeating(String A)
    {
        
        int[] freq=new int[26];
        StringBuilder ans=new StringBuilder();
        Queue<Character>q=new ArrayDeque<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
            while(q.size()>0){
                if(freq[q.peek()-'a']==1){
                    ans.append(q.peek());
                    break;
                }else{
                    q.remove();
                }
            }
            if(q.size()==0){
                ans.append("#");
            }
        }
        return ans.toString();
    }
}
