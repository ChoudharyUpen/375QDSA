//this is more better code than code downside 
class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //i agar agla element sa chota ho gya toh huma wo element mil gya jisko swap karna hai 
        if(i>=0){
            int j=nums.length-1;
            while(j>=0 && nums[j]<=nums[i])j--;
            swap(nums,i,j);
        }
        //ab baki ka array ko reverse kar k sab sa chota bana hai 
        reverse(nums,i+1);
    }
    //ab huma i sa bada elemnt mil gya ab dono ko swap kar do 
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[]nums , int start){
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}









class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int k=n-2;

        //null checks
        if(nums.length==0 || nums==null)return;

        //find k 31442
        for(int i=n-1;i>0;i--){
            if(nums[i]<=nums[i-1])k--;
            else{
                break;
            }
        }
        //if k=-1 reverse
        if(k==-1){
            reverse(nums,0,n-1);
            return;
        }
        //else repalce k with next greater element reverse
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[k]){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse(nums,k+1,n-1);
    }
    void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
