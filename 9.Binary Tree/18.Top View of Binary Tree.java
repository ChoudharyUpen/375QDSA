class Solution {
   //we will not use noraml traveral in it but level order traversal in it that why we will use queue
    static ArrayList<Integer> topView(Node root) {
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,Integer>map=new TreeMap<>();
        
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair cur=q.poll();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd,cur.node.data);
            }
            if(cur.node.left!=null){
                q.add(new Pair(cur.hd-1,cur.node.left));
            }
             if(cur.node.right!=null){
                q.add(new Pair(cur.hd+1,cur.node.right));
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    static class Pair{
        int hd;
        Node node;
        
        public Pair(int hd,Node node){
            this.node=node;
            this.hd=hd;
        }
    }
}
