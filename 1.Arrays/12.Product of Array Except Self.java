class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Edge Cases if array is Empty
        if(nums==null|| nums.length==0)return new int[0];

        int[]result=new int[nums.length];
        int rp=1;

        //Left Pass
        for(int i=0;i<nums.length;i++){
            result[i]=rp;
            rp=rp*nums[i];
        }
        //Right Pass
        rp=1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*rp;
            rp=rp*nums[i];
        }
        return result;
    }
}
