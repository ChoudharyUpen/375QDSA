class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    //Step 1 ek stack bana liya
	    Stack<Integer> stack = new Stack<>();
	    //Step2 Result store karwa na ke liya ek array
	    int res[]=new int[n];
	    for(int i=n-1;i>=0;i--){
	        //Step3 Jab tak stack khali nahi ho jata 
	        //uska top ko compare karo arr[i] sa
	        while(!stack.isEmpty()&& stack.peek()>=arr[i]){
	            stack.pop();
	        }
	        if(stack.isEmpty()){
	            res[i]=-1;
	        }else{
	            res[i]=stack.peek();
	        }
	        stack.push(arr[i]);
	    }
	    return res;
	} 
}
