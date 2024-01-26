class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //s
        int i,count=0,ans=0;
        int n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                ans=Math.max(count,ans);
            }
            else{
                count=0;
            }
        }
        return ans;
    }
}