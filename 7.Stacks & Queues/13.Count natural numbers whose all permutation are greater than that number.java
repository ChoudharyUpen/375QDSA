A simple solution is to run a loop from 1 to n and for every number check if its digits are in non-decreasing order or not.

An efficient solution is based on below observations.

Observation 1: From 1 to 9, all number have this property. So, for n <= 9, output n. 
Observation 2: The number whose all permutation is greater than or equal to that number have all their digits in increasing order.

// Java program to count the number less than N, 
// whose all permutation is greater 
// than or equal to the number. 
import java.util.Stack; 


class GFG 
{ 
	// Return the count of the number having all 
	// permutation greater than or equal to the number. 

	static int countNumber(int n) 
	{ 
		int result = 0; 

		// Pushing 1 to 9 because all number from 1 
		// to 9 have this property. 
		Stack<Integer> s = new Stack<>(); 
		for (int i = 1; i <= 9; i++) 
		{ 

			if (i <= n) 
			{ 
				s.push(i); 
				result++; 
			} 

			// take a number from stack and add 
			// a digit greater than or equal to last digit 
			// of it. 
			while (!s.empty()) 
			{ 
				int tp = s.pop(); 
				
				for (int j = tp % 10; j <= 9; j++) 
				{ 
					int x = tp * 10 + j; 
					if (x <= n) { 
						s.push(x); 
						result++; 
					} 
				} 
			} 
		} 

		return result; 
	} 

	// Driven Code 
	public static void main(String[] args) 
	{ 
		int n = 15; 
		System.out.println(countNumber(n)); 
	} 
} 

// this code contributed by Rajput-Ji
