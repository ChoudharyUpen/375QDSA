//newly updated code with differnt return type
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int abs=Math.abs(arr[i]);
            if(arr[abs-1]>0){
                arr[abs-1]=-arr[abs-1];
            }
            else{
                ans.add(abs);
            }
        }
           for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}







//is code ka kaam hai array me duplicate element aur missing number find karna
//this is a good question practice it 
//i have undertanded this with the help of chatgpt on 7-12-2024 now revise it so much that you dont have to learn this again from chatgpt
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] ans=new int[2];
        // //to find duplicate number 
        for(int i=0;i<n;i++){
            int abs_val=Math.abs(arr[i]);

            ab hum check kartha hai ki vo number visited hai nahi with the help of minus 
            if(arr[abs_val-1]>0)
            arr[abs_val-1]=-arr[abs_val-1];

            agar uspa minus laga hu hai toh iska maatlab hai vo visited hai or huma answer mil gya hai  vo abs_val he answer hoga 
            else
            ans[0]=abs_val;
        }

        //to find missing number 
        huma missing number mila ga ki  +ve number doondtha jo or jis index pa positive number mila us ka index number +1 he answer hoga  
        for(i=0;i<n;i++){
            if(arr[i]>0)ans[1]=i+1;
        }
        return ans;
    }
}
