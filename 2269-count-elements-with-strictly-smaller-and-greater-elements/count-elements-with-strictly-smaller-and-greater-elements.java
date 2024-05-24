class Solution {
    public int countElements(int[] nums) {
        int mini=nums[0];
        int maxi=nums[0];
        int n=nums.length;
        int count=0;
        int i,j;
        for(i=1;i<n;i++){
            mini=Math.min(mini,nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }
        // count elements that aren't equal to min and max
        for(i=0;i<n;i++){
            if(nums[i]>mini && nums[i]<maxi)
                count++;
        }
        return count;
    }
}