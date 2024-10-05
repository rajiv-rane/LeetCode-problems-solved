class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if(nums.length==0) return nums;
        int temp[]=new int [nums.length];
        int even=0;int odd=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                temp[even]=nums[i];
                even=even+2;
            }
            else{
                temp[odd]=nums[i];
                odd=odd+2;
            }
        }
        return temp;
    }
}