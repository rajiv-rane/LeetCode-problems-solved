class Solution {
    public int trap(int[] height) {
        int i,j,ans=0;
        int n=height.length;
        int leftmax[]=new int [n];
        int rightmax[]=new int [n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];

        for(i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        for(i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int water=0;
        for(i=0;i<n;i++){
            water=Math.min(leftmax[i],rightmax[i])-height[i];
            // if(water>0)
                ans=ans+water;
        }
        return ans;
        
    }
}