class Solution {
    public int[] searchRange(int[] nums, int target) {
        // first occurrence
        int s=0;int e=nums.length-1;
        int first=-1;int last=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                //it's a psbl answer
                first=m;
                //go to left side for better ans
                e=m-1;
            }
            else if(nums[m]>target){
                //go left
                e=m-1;
            }
            else{
                //go right
                s=m+1;
            }
        }

        s=0;e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                //update ans and check on right for better ans
                last=m;
                s=m+1;
            }
            else if(nums[m]>target){
                // go to left
                e=m-1;
            }
            else{//nums[m]<target
                //check right
                s=m+1;
            }
        }
        int ans[]=new int[2];
        ans[0]=first;ans[1]=last;
        return ans;
    }
}