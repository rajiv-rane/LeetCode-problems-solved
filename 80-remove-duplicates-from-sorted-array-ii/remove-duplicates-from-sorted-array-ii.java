class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l=0;
        int r=0;
        int n=nums.length;

        while(r<n){
            int count=1;

            while( (r+1 < n) && (nums[r]==nums[r+1])){
                r=r+1;
                count++;
            }

            for(int i=0;i<Math.min(2,count);i++){
                nums[l]=nums[r];
                l++;
            }

            r++;
        }
        return l;
        
    }
}