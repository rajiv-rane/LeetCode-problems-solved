class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int i;int leftsum[]=new int[n]; int rightsum[]=new int[n];
        int prefix[]=new int[n];int suffix[]=new int[n];
        //create prefix and suffix in one iteration
        prefix[0]=nums[0];
        suffix[0]=nums[n-1];
        for(i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
            suffix[i]=suffix[i-1]+nums[n-i-1];
        }
        //get left & right sum
        for(i=0;i<n;i++){
            leftsum[i]=prefix[i]-nums[i];
            rightsum[i]=suffix[n-i-1]-nums[i];
        }
        //final answer= nums[i]=|leftsum[i]-rightsum[i]|
        for(i=0;i<n;i++){
            nums[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return nums;
        
    }
}