class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,Integer>map=new TreeMap<>();
        
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair cur=q.poll();
            map.put(cur.hd,cur.node.data);
            
            if(cur.node.left!=null){
                q.add(new Pair(cur.hd-1,cur.node.left));
            }
             if(cur.node.right!=null){
                q.add(new Pair(cur.hd+1,cur.node.right));
            }
        }
       //Final answer tau hama arraylist ma return karna hai is liye ans arraylist bana ka usma loop
       //chalaga map sa value dalenge or return karenge
        ArrayList<Integer>ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
   //ye islye banya taki haum queue ma 2 value ger saka
    static class Pair{
        int hd;
        Node node;
        
        public Pair(int hd,Node node){
            this.node=node;
            this.hd=hd;
        }
    }
}
