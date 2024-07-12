//gfg
Example 1:
Input:
n = 13  arr[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56} k = 4, x = 35
Output: 39 30 42 45
Explanation: 
First closest element to 35 is 39.
Second closest element to 35 is 30.
Third closest element to 35 is 42.
And fourth closest element to 35 is 45.

Example 2:
Input:
n = 5 arr[] = {1, 2, 3, 6, 10} k = 3, x = 4
Output: 3 6 2
Explanation: 
First closest element is 3.
There are two elements 2 and 6 for which 
the difference with 4 is same i.e. 2.
So first take greatest number 6 
then the lower number 2.
   
class Solution {
   public class Pair {
        Integer key;
        Integer value;
        public Pair(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    int[] printKClosest(int[] arr, int n, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Comparator<Pair>() {
           
            // This method defines how the PriorityQueue should order the elements, which in this case are instances of the Pair class
            //This method is used to compare two Pair objects in the max-heap..



           // use of this 4 line code ----- The compare method in the PriorityQueue comparator is crucial for defining the ordering of elements in the heap.
          public int compare(Pair a, Pair b) {
    // Agar do elements ka x se same difference hai, toh greater element ko priority do
    if (b.key.equals(a.key))
        return a.value - b.value;
    // Agar differences same nahi hai, toh larger difference (key) wale element ko priority do
    return b.key - a.key;
 }

        });
      //#1
        for (int i = 0; i < n; i++) {
           //same element nahi hona chaiye is liye ye if condition lagi hai
            if (arr[i] - x != 0) {
               //adding the number in pq with its new frequency  frequency based on where it was found
                maxHeap.add(new Pair(Math.abs(arr[i] - x), arr[i]));

               //phela maxheap mai add ho jaye ga fir check karenge or remove karenge\
               // remove the element with the highest difference from x.
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }

        int[] closest = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            closest[i] = maxHeap.poll().value;
        }
      //The array closest is [6, 2, 3].
        return closest;
    }
}
