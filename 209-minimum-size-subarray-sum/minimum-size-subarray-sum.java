class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;int j=0;int n=nums.length;
        int currsum=0;
        int currLen=0;
        int minLen=Integer.MAX_VALUE;
        while(j<n){
            currsum+=nums[j];
            // currLen++;
            while(currsum>=target){
                currsum-=nums[i];
                currLen=j-i+1;
                minLen=Math.min(currLen,minLen);
                i++;
            }
            if(currsum<target){
                j++;
            }
        }


        return minLen==Integer.MAX_VALUE ?0:minLen;
    }
}