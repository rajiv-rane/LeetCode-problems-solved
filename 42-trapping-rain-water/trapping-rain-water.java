class Solution {
    public int trap(int[] height) {
        // for every gate find the largest gate closest to it
        int i,j,k;
        int n=height.length;
        int leftmax=0,rightmax=0;
        int [] left = new int[n];
        Arrays.fill(left, 0);
        int [] right = new int[n];
        Arrays.fill(right, 0);
        left[0]=height[0];
        right[n-1]=height[n-1];
        int [] water = new int[n];
        Arrays.fill(water, 0);
        int ans=0;
        
        // left max height
        for(i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        // right max ht
        for(i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }

        // water stored @i=min(Leftmax,rightmax)-gate[i]

        for(i=0;i<n;i++){
            water[i]=Math.min(left[i],right[i])-height[i];
            // if(water[i]>0)
                ans=ans+water[i];
        }
        return ans;
    }
}