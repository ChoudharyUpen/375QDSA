//dry run this code by yourself + teach this question to yourself+(M.Imp) question
class Solution {
       HashMap<String, Integer> map;

    String subtree(Node root){
        if(root == null)
        	return "$";
        
        if(root.left == null && root.right == null)
        return "" + root.data + "-";
        
        String str = "" + root.data + "-";
        str += 	subtree(root.left);
        str += subtree(root.right);
        
        map.put(str,map.getOrDefault(str,0)+1);
        return str;
    }
    int dupSub(Node root) {
         // code here 
        map = new HashMap<>();
        subtree(root);
        
        for(String key : map.keySet()){
        if(map.get(key) >= 2)
        	return 1;
        }
        
        return 0;
    }
}


// The map looks like this after the traversal:

// {
//     "4-": 2,
//     "5-": 2,
//     "2-4-5-": 2,
//     "3-$2-4-5-": 1,
//     "1-2-4-5-3-$2-4-5-": 1
// }
