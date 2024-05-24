class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int Globalsum=0;
        int sum=0;
        int i,j; int n=nums.length;
        for(i=0;i<k;i++){
           sum=sum+nums[i]; 
        }
        Globalsum=sum;
        for(i=k;i<n;i++){
            sum=sum-nums[i-k];
            sum=sum+nums[i];
            Globalsum=Math.max(sum,Globalsum);
        }
        return (double)Globalsum/k;
    }
}