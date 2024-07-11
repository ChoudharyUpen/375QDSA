Input:
n = 6    arr[] = 7 10 4 3 20 15    k = 3  l=0  r=5
Output : 
7
Explanation :
3rd smallest element in the given array is 7.

    
//dont revise dont learn this question this question is just a waste of time
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        Arrays.sort(arr);
        return arr[k-1];
    } }
