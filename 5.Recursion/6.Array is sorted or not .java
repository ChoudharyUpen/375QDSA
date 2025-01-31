public class q6 {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
    public static void main(String Args[]) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(isSorted(arr, 0));
    }
}









//Check Array is Sorted Or Not
public class q6 {
    public static boolean isSorted(int arr[], int i) {
        // Base Case
        if (i == arr.length - 1) {
            return true;
        }
        // If this Condition is false means they both are sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        // Now we have to check for the rest one
        return isSorted(arr, i + 1);
    }

    public static void main(String Args[]) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(isSorted(arr, 0));

    }
}
