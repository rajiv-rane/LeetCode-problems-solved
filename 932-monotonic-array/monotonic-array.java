class Solution {
    public boolean is_inc(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])
                return false;
        }
        return true;
    }
    public boolean is_dec(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i])
                return false;
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        return (is_inc(nums)|| is_dec(nums));
    }
}