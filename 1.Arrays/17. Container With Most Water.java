//if you are not understanding this learn from chatgpt with the help of dry run it is very easy question

class Solution {
    public int maxArea(int[] height) {
        //ye 2 pointer le liye 
       int l=0;
       int r=height.length-1;
       //max area store karwa na k liye variable
       int max=0;
       //jab tak chala ga jb tak l==r nahi ho jaa tha
       while(l<r){
        int lh=height[l];
        int rh=height[r];
        int min_h=Math.min(lh,rh);
        //9-1
        int len=r-l;
        int curr_area=min_h*len;
        max=Math.max(max,curr_area);
        if(lh<rh)l++;
        else r--;
       } 
       return max;
    }
}
