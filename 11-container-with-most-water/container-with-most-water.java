class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int MaxArea=0;
        while(i<j){
            int area=Math.min(height[i],height[j])*(j-i);
            MaxArea=Math.max(area,MaxArea);
            if(height[i]>height[j]){
                j--;
            }
            else
                i++;
        }
        return MaxArea;
    }
}