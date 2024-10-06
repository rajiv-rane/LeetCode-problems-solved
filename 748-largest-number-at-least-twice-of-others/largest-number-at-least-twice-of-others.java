class Solution {
    public int dominantIndex(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        
        for(int i:nums){
            max1=Math.max(max1,i);
            // if(max1<nums[i]){
            //     max2=max1;
            //     max1=nums[i];
            //     idx=i;
            // }
            // else if(nums[i]>max2){
            //     max2=nums[i];
            // }

        }

        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max1)
                idx=i;
            if(nums[i]*2>max1 && nums[i]!=max1)
                return -1;
        }

        return idx;
    }
}