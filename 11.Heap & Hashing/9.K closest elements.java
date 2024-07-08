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
            public int compare(Pair a, Pair b) {
                // If two elements have the same difference as x, the greater element is prioritized.
                if (b.key.equals(a.key))
                    return a.value - b.value;
                    //If the differences are not the same, the method prioritizes the element with the larger difference (key).
                return b.key - a.key;
            }
        });

        for (int i = 0; i < n; i++) {
            if (arr[i] - x != 0) {
                maxHeap.add(new Pair(Math.abs(arr[i] - x), arr[i]));

                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }

        int[] closest = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            closest[i] = maxHeap.poll().value;
        }

        return closest;
    }
}
