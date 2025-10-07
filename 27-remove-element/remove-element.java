class Solution {
    public int removeElement(int[] nums, int val) {
        // int i=0;
        int n=nums.length;
        int k=0;
        // int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}