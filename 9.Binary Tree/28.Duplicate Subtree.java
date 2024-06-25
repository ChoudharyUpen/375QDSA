class Solution{

    // Method to print all duplicate subtrees
    public List<Node> printAllDups(Node root)
    {
       // code here
       HashMap<String, Integer> s = new HashMap<>();
       List<Node> l = new ArrayList<>();
       helper(root, l, s);
    
       // Sorting the list of duplicate subtree roots by their data value
       Collections.sort(l, (a, b) -> a.data - b.data);
       return l;
    }
    
    // Helper method to traverse the tree and find duplicate subtrees
    public String helper(Node root, List<Node> l, HashMap<String, Integer> s) {
        // Agar root null hai to empty string return karo
        if(root == null) return "";
        
        // Left subtree ka result
        String left = helper(root.left, l, s);
        // Right subtree ka result
        String right = helper(root.right, l, s);
        
        // Current node ka serialization
        String curr = left + "-" + root.data + "-" + right;
        // Frequency check kar rahe hain - agar already 1 hai to list mein add kar do kyunki iska matlab hai duplicate mil gaya
        if(s.getOrDefault(curr, 0) == 1) {  // Sirf ek hi baar duplicate subtree ka root add hona chahiye
            l.add(root);
        }
        // Frequency calculate kar rahe hain aur HashMap mein daal rahe hain
        s.put(curr, s.getOrDefault(curr, 0) + 1); // Frequency update kar rahe hain
        return curr;
    }
}

