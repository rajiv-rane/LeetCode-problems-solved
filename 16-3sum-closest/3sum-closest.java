class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;

        int ans_sum=0;
        int diff=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k && j<n && k>=0){
                int tsum=nums[i]+nums[j]+nums[k];

                if(Math.abs(tsum-target)<diff){
                    ans_sum=tsum;
                    // update min diff
                    diff=Math.abs(tsum-target);
                }
                if(tsum>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans_sum;

    }
}