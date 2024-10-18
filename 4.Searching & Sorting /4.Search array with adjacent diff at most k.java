// Examples

// Input: arr[] = [4, 5, 6, 7, 6] , k = 1 , x = 6
// Shuru mein i = 0, check hota hai arr[0] = 4.
// Since 4 ≠ 6, hum agle index pe jaayenge.

// Next step:
// difference = |4 − 6| = 2
// 2 / 1 = 2, matlab 2 indexes skip karenge.

// Ab i = 0 + 2 = 2.
// Ab check hoga arr[2] = 6, jo x ke barabar hai, to 2 return hoga.


class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == x) {
                return i;
            }
            i += Math.max(1, Math.abs(arr[i] - x) / k);
        }
        return -1;
    }
}
