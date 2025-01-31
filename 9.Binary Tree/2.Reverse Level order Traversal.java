//Learned From Code kar lo YouTube channel

class Tree{
    public ArrayList<Integer> reverseLevelOrder(Node node) {
    ArrayList<Integer> ans= new ArrayList<>();
    //Iska matlab hai ki hum Queue bana rahe hain jo LinkedList ke andar store ho rahi hai.
    Queue <Node> q=new LinkedList<>();
    q.add(node);
    while(q.size()!=0){
        Node temp=q.remove();
        ans.add(temp.data);
        if(temp.right!=null)q.add(temp.right);
        if(temp.left!=null)q.add(temp.left);
    }
    Collections.reverse(ans);
    return ans;
    }}
