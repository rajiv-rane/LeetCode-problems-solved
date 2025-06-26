class Solution {

    public int maxSub(int nums[], int i,int dp[]) {
        if (i < 0) {
            return 0;
        }

        if (dp[i] == -1) {
            dp[i] = Math.max(maxSub(nums,i - 1,dp), maxSub(nums,i - 2,dp) + nums[i]);
        }
        return dp[i];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        // -1 to denote not visited 

        maxSub(nums, n - 1,dp);
        return dp[n - 1];
    }
}