class Solution {
    void solve(Node root,Node[] prev){
        if(root==null)return;
        solve(root.left,prev);
        
        if( prev[0]!=null){
            //jo arrow   / aise lagi thi hum use palat kar upar ki taraf kar denge
            prev[0].next=root;
        }
         prev[0]=root;
        solve(root.right,prev);
    }
    public void populateNext(Node root) {
        Node[] prev = new Node[1];
        prev[0] = null;
        solve(root,prev);
    }}
