//done from anuj bhaiya video

class Solution {
    public int trap(int[] height) {
        //n= length of the street or road
        int n=height.length;
        //pointing 2 pointer at left and right
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=height[0];

        //current element or just pichla elemnet mai sa jo bhi bada hoga wo left[i] array mai aa jayega 
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}
