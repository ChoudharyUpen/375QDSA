class Solution{
	
	ArrayList <Integer> boundary(Node root){
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    //checking is root node is not equal to null.
	    if(root == null) return res;
	     //adding data of root node to res.
	    res.add(root.data);
	    if(isLeafNode(root)){
	        return res;
	    }
	    
	   
	    
	    //calling addLeftNode function to add left nodes.
	    addLeftNode(root.left, res);
	    
	    //calling addLeafNodes fucntion to add leaf nodes.
	    addLeafNode(root, res);
	    
	    //calling addRightNode function to add right nodes.
	    addRightNode(root.right, res);
	    
	    //returning the result
	    return res;
	}
	
	boolean isLeafNode(Node root){
	    return root.left == null && root.right == null;
	} 
	
	void addLeafNode(Node root, ArrayList<Integer> res){
	    
	    //checking if given node is leaf node or not.
	    if(isLeafNode(root)){
	        res.add(root.data);
	        return;
	    }
	    // passing the left child of root to this function. 
	    if(root.left != null) addLeafNode(root.left, res);
	    
	    // passing the right child of root to this function. 
	    if(root.right != null) addLeafNode(root.right, res);
	}
	
	void addLeftNode(Node root, ArrayList<Integer> res){
	    
	    //current point to the root node.
	    Node current = root;
	    
	    while(current != null){
	        //checking if given node is leaf or not.
	        if(!isLeafNode(current)) res.add(current.data);
	        
	        // if child is not null, current will point to its child.
	        if(current.left != null) current = current.left;
	        else current = current.right;
	    }
	}
	
	void addRightNode(Node root, ArrayList<Integer> res){
	    
	    //current point to the root node.
	    Node current = root;
	
	    ArrayList<Integer> temp = new ArrayList<>();
	    
	    while(current != null){
	        //checking if given node is leaf or not.
	        if(!isLeafNode(current)) temp.add(current.data);
	        
	        // if child is not null, current will point to its child.
	        if(current.right != null) current = current.right;
	        else current = current.left;
	    }
	    
	    Collections.reverse(temp);
	    for(int i : temp){
	        res.add(i);
	    }
	}
}
