//below this is the same code but with commments this code is without comments 
class GFG{
	static int findMinOps(int[] arr, int n){
		int ans = 0;
		for (int i=0,j=n-1; i<=j;){
			if (arr[i] == arr[j]){
				i++;j--;
			}
			else if (arr[i] > arr[j]){
				j--;
				arr[j] += arr[j+1];
				ans++;
			}
			else{
				i++;
				arr[i] += arr[i-1];
				ans++;
			}
		}return ans;
	}
	public static void main(String[] args){
		int arr[] = new int[]{1, 4, 5, 9, 1};
		System.out.println("Count of minimum operations is "+findMinOps(arr, arr.length));
	}}





// Java program to find number of operations
// to make an array palindrome
Two Pointer Aprroach is used in this program what special in this progrma is Merging:

class GFG
{
	// Returns minimum number of count operations
	// required to make arr[] palindrome
	static int findMinOps(int[] arr, int n)
	{
		int ans = 0; // Initialize result

		// Start from two corners
		for (int i=0,j=n-1; i<=j;)
		{
			// If corner elements are same,
			// problem reduces arr[i+1..j-1]
			if (arr[i] == arr[j])
			{
				i++;
				j--;
			}

			// If left element is greater, then
			// we merge right two elements
			else if (arr[i] > arr[j])
			{
				// need to merge from tail.
				j--;
				arr[j] += arr[j+1] ;
				ans++;
			}

			// Else we merge left two elements
			else
			{
				i++;
				arr[i] += arr[i-1];
				ans++;
			}
		}

		return ans;
	}

	// Driver method to test the above function
	public static void main(String[] args)
	{
		int arr[] = new int[]{1, 4, 5, 9, 1} ;
		System.out.println("Count of minimum operations is "+
								findMinOps(arr, arr.length));
	
	}
}
