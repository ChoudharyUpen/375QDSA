//is code ka kaam hai array me duplicate element aur missing number find karna
//this is a good question practice it 
//i have undertanded this with the help of chatgpt on 7-12-2024 now revise it so much that you dont have to learn this again from chatgpt
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] ans=new int[2];
        // //to find duplicate number 
        for(int i=0;i<n;i++){
            int abs_val=Math.abs(arr[i]);
            if(arr[abs_val-1]>0)
            arr[abs_val-1]=-arr[abs_val-1];
            else
            ans[0]=abs_val;
        }

        //to find missing number 
        for(i=0;i<n;i++){
            if(arr[i]>0)ans[1]=i+1;
        }
        return ans;
    }
}
