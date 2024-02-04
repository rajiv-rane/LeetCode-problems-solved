class Solution {
    public int findNonMinOrMax(int[] nums) {
       //find max and min
       int MaxValue=nums[0];
       int MinValue=nums[0];
       int i,n=nums.length;
       for(i=1;i<n;i++){
           MaxValue=Math.max(MaxValue,nums[i]);
           MinValue=Math.min(MinValue,nums[i]);
       }
       for(i=0;i<n;i++){
           if(nums[i]!=MaxValue && nums[i]!=MinValue){
               return nums[i];
           }
       }
       return -1;
    }
}