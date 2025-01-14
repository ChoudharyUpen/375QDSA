class Solution{
    int tour(int petrol[], int distance[]){
	int n = petrol.length;
	    
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
        return (surplus + deficit >= 0) ? start : -1;	   
    }
}
