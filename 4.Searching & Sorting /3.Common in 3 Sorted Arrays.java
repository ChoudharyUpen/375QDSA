//approach used was same what i thought but i was confused by
// Note: can you handle the duplicates without using any additional Data Structure?
//gfg
//gfg solutions



// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.size();i++){
                map.put(arr1.get(i),1);    
        }
        for(int i=0;i<arr2.size();i++){
            if(map.containsKey(arr2.get(i))){
                map.put(arr2.get(i),2);    
            }
        }for(int i=0;i<arr3.size();i++){
            if(map.containsKey(arr3.get(i))){
               if(map.get(arr3.get(i))==2){
                   map.put(arr3.get(i),3);
                   list.add(arr3.get(i));
               }
                
            }
        }
        return list;
    }
}


// 1.Incorrect List Initialization.
// 2.Incorrect Map Initialization.
// 3.Using length instead of size() for Lists.
// 4.Incorrect Method contains Usage.
// 5.Incorrect if Statement and Variable Usage.
// 6.No Return Statement.
// class Solution {
//     // Function to find common elements in three arrays.
//     public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
//                                         List<Integer> arr3) {
//         List<Integer>= new List<>();
//         Map<Integer,Integer> map= new Hashmap<>();
//         for(int i=0;i<arr1.length;i++){
//             map.put(arr1[i],1);
//         }
//          for(int i=0;i<arr2.length;i++){
//             if(map.contains(arr1[i],2);
//         }
//           for(int i=0;i<arr3.length;i++){
//             if(map.contains(arr1[i]){
//                 if(arr[i]==2){
//                     map.put(arr[i],3);
//                     list.add(arr[i]);
//                 }
//             }
//         }
        
//     }
// }
