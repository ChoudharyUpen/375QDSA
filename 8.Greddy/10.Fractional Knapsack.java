class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        //Step 1 (v/w)  Ratio k hisab se Sort Descending Order ma
        Arrays.sort(arr,(a,b)-> Double.compare(b.value*1.0/b.weight,a.value*1.0/a.weight));
    
    //Step 2 ham apna weight calculate karna k liye 
    //ki bag kitna bar gya hai uska liye ak temporary wt bana lenga
    int Wt=0;
    //Step 3 pf ma value store karwa karwa ka return karenge
    double pf=0.0;
    
    for(int i=0;i<n;i++){
        // Step 3 agar bag k weight or jo hamna bhar liya wo 
        //barabar ho gya tau return kar do
        if(Wt==w)break;
        
        //Step 4 temp ma temorary weight store karw lo 
        //or Compare karo
        int temp=arr[i].weight;
        if(temp<=w-Wt){
            pf+=arr[i].value;
            Wt+=temp;
        }
        //Step 5 agar saman k weight bag ma bacha hua weight 
        //sa jayda ho gya tau ham us hisab sa tod kar store karwa 
        //lenge 
        else{
            pf+=(w-Wt)*(arr[i].value*1.0/temp);
            Wt=w;
        }
    }
    //Step 6 return the answer
    return pf;
        
    }
    
}
