class Solution {
    public int minimumSum(int[] nums) {
        int count=0;int n=nums.length;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if((nums[i]<nums[j])&&(nums[k] < nums[j])){
                        int sum=nums[i]+nums[j]+nums[k];
                        minsum=Math.min(minsum,sum);
                    }

                }
            }
        }
        if(minsum!=Integer.MAX_VALUE)
            return minsum;
        return -1;
    }
}