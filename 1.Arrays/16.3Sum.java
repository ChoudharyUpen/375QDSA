// HashSet: Duplicates ko avoid karne ke liye.
// ArrayList: Final result ko ordered list format me dene ke liye.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
           Set<List<Integer>> res = new HashSet<>();  
        if(nums.length==0)return new ArrayList<>(res);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum== -nums[i]){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                }
                else if(sum>-nums[i])k--;
                else if(sum<-nums[i])j++;
            }
        }
        return new ArrayList<>(res);
    }
}
