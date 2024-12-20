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
            //isma current or pichla compare karwana hai 
            left[i]=Math.max(left[i-1],height[i]);
        }
        
        right[n-1]=height[n-1]; //means the last position in the right will be same as the position of the element .
        for(int i=n-2;i>=0;i--){
            //isma current or usa agla compare karwana hai
            right[i]=Math.max(right[i+1],height[i]);
        }
        int ans=0; //ans variable k anadar humara file answer store hoga 
        for(int i=0;i<n;i++){
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}
