//very easy i find it gfg question
class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	   int n = petrol.length;
        
        // Initialize variables
      //STEP 1 TAKING 3 POINTERS
        int start = 0;
        int deficit = 0;
        int surplus = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }

        // Check if the total surplus and deficit makes it possible to complete the circle
      //IF ADDING BOTH -VE AND +VE NUMBER RESULT IS +VE THEN IT IS GOOD TO START 
      //FROM THAT PETROL PUMP OTHERWISE NOT
        return (surplus + deficit >= 0) ? start : -1;
	   
    }
}
