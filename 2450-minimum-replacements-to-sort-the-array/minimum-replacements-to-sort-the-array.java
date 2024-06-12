class Solution {
    public long minimumReplacement(int[] nums) {
        int n=nums.length;
        int last=nums[n-1];
        long ans=0;
        int steps=0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]>last){
                steps=(nums[i]-1)/last;
                last=nums[i]/(steps+1);
                ans+=steps;
            }
            else{
                last=nums[i];
            }
        }
        return ans;
    }
}