class Solution {
    public int findMin(int[] nums) {
        int a = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(a>nums[i]){
                a=nums[i];
            }
        }return a;
    }
}
