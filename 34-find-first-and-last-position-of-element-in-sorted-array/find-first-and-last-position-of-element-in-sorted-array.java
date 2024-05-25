class Solution {
    public int[] searchRange(int[] nums, int target) {
        // 2 pointer
        int left=-1,right=-1;
        int s=0;int e=nums.length-1;
        while(s<=e){
            if(nums[s]==target && nums[e]==target){
                left=s;
                right=e;
                break;
            }
            else if(nums[s]<target){
                s++;
            }
            else {
                e--;
            }
        }
        int ans[]={left,right};
        return ans;
        // int ans[]={-1,-1};
        // int i=0;
        // int s=0; int e=nums.length-1;
        // while(s<e){
        //     int mid=(s+e)/2;
        //     if(nums[mid]==target){
                
                
        //     }
        // }
    }
}