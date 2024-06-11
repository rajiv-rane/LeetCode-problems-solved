class Solution {
    public int maxSubArray(int[] nums) {
        int globalsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            if(currsum<0)
                currsum=0;
            currsum+=nums[i];
            globalsum=Math.max(currsum,globalsum);

        }
        return globalsum;
    }
}