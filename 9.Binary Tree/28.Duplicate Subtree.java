class Solution{
   
    public List<Node> printAllDups(Node root)
    {
       //code here
       HashMap<String, Integer> s = new HashMap<>();
       List<Node> l = new ArrayList<>();
       helper(root, l, s);
    
       Collections.sort(l, (a,b) -> a.data - b.data);
       return l;
    }
    
    public String helper(Node root, List<Node> l, HashMap<String, Integer> s) {
        if(root == null) return "";
        
        String left = helper(root.left, l, s);
        String right = helper(root.right, l, s);
        
        String curr = left + "-" + root.data + "-" + right;
       // checking frequency --- if it is already 1 adding it into the list means it already came and now we have find duplicate 
        if(s.getOrDefault(curr, 0) == 1) {  // only once the duplicate subtree root should be added
            l.add(root);
        }
       // Calculating the Frequency 
        s.put(curr, s.getOrDefault(curr, 0) + 1); // updating frequency
        return curr;
    }
    
}
