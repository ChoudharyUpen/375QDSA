//WAF to find the last occurence of an element in an array
public class q8 {
    public static int lastOccurence(int arr[], int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        // Iska matalb hai hame nahi mili apni key
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        // Is ka matlab hai us number ka last occurence exist kartha hai or usa return
        // karna hai

        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        System.out.println(lastOccurence(arr, key, 0));
    }
}
