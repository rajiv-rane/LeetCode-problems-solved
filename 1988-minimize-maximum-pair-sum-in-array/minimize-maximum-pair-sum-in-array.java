class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int  maxsum=0;
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int sum=nums[s]+nums[e];
            maxsum=Math.max(sum,maxsum);
            s++;e--;
        }
        return maxsum;
    }
}