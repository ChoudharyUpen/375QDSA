class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {

        //Step1 Find Potential Celebrity which is not 1
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (M[candidate][i] == 1)
                candidate = i;
        }
        //Step 2 Verify the Potential Celebrity
        for (int i = 0; i < n; i++) {
            //i != candidate  kud ka saath compare nahi kar rahe
            //check if the candiate know person i
            //check if the person i doesnot know the candiate
            if (i != candidate && (M[candidate][i] == 1 || M[i][candidate] == 0))
                return -1; 
        }
        return candidate; 
    }
}
