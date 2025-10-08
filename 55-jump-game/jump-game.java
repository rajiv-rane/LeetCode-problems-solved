class Solution {
    public boolean canJump(int[] nums) {
        // greedy solution

        int goal=nums.length-1;
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }

        if(goal>0){
            return false;
        }
        return true;
    }
}