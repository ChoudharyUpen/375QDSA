
              1
             /   \ 
           2       3
         /   \       \    
        4     5       2     
                     /  \    
                    4    5
 
              VS
              
              
                1     ---Dikat is case ma aye ge kyuki isa same subtree bta dega 
             /   \      par ya same thodi na hai
           2       3      
         /   \       \    Tau iska Solution hai Ki hum ya par ek Deleimeter use karenge
        4     5       2     if we use Delimeter in this case: 
                       \     245 vs 2$4$5$ --- the answer will be false
                        5    if we use don't use Delimeter in this case: 
                        \      245 vs 245 --- the answer will be True
                        4     So Using Delimeter is Important for passing all test cases
 
 
 
 1.Duplicate Subtree of size 2 or more
 2. Don't Consider Leaf Node Alone


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
