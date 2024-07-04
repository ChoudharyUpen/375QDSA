Steps to Complete this question
Step1 Inorder Both tree ----- arraylist
Step2 Merge both array
Step3 Last day wala concept normal bst to binary

Revise these type of question beacuse these question 
contain concept of 2 -3 question 
Revise Less but revise quality


class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public void getInorder(Node root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
   public List<Integer> merge(Node root1, Node root2) {
    // Write your code here

    // Create an ArrayList to store the in-order traversal of the first tree
    ArrayList<Integer> arr1 = new ArrayList<>();
    // Fill arr1 with the in-order traversal of the first tree
    getInorder(root1, arr1);
    
    // Create an ArrayList to store the in-order traversal of the second tree
    ArrayList<Integer> arr2 = new ArrayList<>();
    // Fill arr2 with the in-order traversal of the second tree
    getInorder(root2, arr2);
    
    // Initialize two pointers for traversing the two lists
    int i = 0, j = 0;
    // Create an ArrayList to store the merged sorted elements
    ArrayList<Integer> finalArr = new ArrayList<>();
    
    // Merge the two sorted lists into finalArr
    while (i < arr1.size() && j < arr2.size()) {
        if (arr1.get(i) <= arr2.get(j)) {
            // Add the smaller element from arr1 to finalArr
            finalArr.add(arr1.get(i));
            i++;  // Move the pointer in arr1
        } else {
            // Add the smaller element from arr2 to finalArr
            finalArr.add(arr2.get(j));
            j++;  // Move the pointer in arr2
        }
    }
    
    // Add the remaining elements of arr1 to finalArr (if any)
    while (i < arr1.size()) {
        finalArr.add(arr1.get(i));
        i++;
    }
    
    // Add the remaining elements of arr2 to finalArr (if any)
    while (j < arr2.size()) {
        finalArr.add(arr2.get(j));
        j++;
    }
    
    // Return the merged list
    return finalArr;
}
}
