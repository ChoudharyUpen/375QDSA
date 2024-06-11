// Java program to find minimum 
// number of squares to cut a paper.
//dry run is also given at end
class GFG{
	
// To swap two numbers
static void swap(int a,int b)
{
	int temp = a;
	a = b;
	b = temp;
}

// Returns min number of squares needed
static int minimumSquare(int a, int b)
{
	int result = 0, rem = 0;

	// swap if a is small size side .
	if (a < b)
		swap(a, b);

	// Iterate until small size side is
	// greater than 0
	while (b > 0)
	{
 //ye main line hai
		// Update result
		result += a/b;
		rem = a % b;
		a = b;
		b = rem;
	}

	return result;
}

// Driver code
public static void main(String[] args)
{
	int n = 13, m = 29;
	System.out.println(minimumSquare(n, m));
}
}

//This code is contributed by Smitha Dinesh Semwal.
To dry run the code for the input 13 x 29, let's go step by step:

1. Initially, a = 13 and b = 29.
2. Since a is smaller than b, we swap them: a = 29 and b = 13.
3. In the while loop:
   - Iteration 1:
     - result += a / b = 29 / 13 = 2
     - rem = a % b = 29 % 13 = 3
     - Update values: a = 13, b = 3
   - Iteration 2:
     - result += a / b = 13 / 3 = 4
     - rem = a % b = 13 % 3 = 1
     - Update values: a = 3, b = 1
   - Iteration 3:
     - result += a / b = 3 / 1 = 3
     - rem = a % b = 3 % 1 = 0
     - Update values: a = 1, b = 0
4. The while loop ends since b becomes 0.
5. The final result is 2 + 4 + 3 = 9.

Therefore, for the input 13 x 29, the code will output 9, which means you would need a minimum of 9 squares to cut the paper into a rectangle.
