class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        int n=nums.length;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                int ans=(nums[i]-1)*(nums[j]-1);
                res=Math.max(res,ans);
            }
        }
        return res;
    }
}