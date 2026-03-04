class Solution {
    public int maxArea(int[] height) {
        int i,j;
        int leftmax=0,rightmax=0;
        int MaxArea=0;
        i=0;j=height.length-1;
        int Area;
        while(i<j){
            Area=Math.min(height[i],height[j])*(j-i);
            MaxArea=Math.max(MaxArea,Area);
            if(height[i]>height[j])
                j--;
            else
                i++;
        }
        return MaxArea;
    }
}