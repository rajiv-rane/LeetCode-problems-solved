class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=0;
        int minLen=Integer.MAX_VALUE;
        // int minsum=0;
        int currsum=0;
        int i=0;int j=0;
        while(j<nums.length){
            currsum+=nums[j];
            while(currsum>=target){
                len=j-i+1;
                currsum=currsum-nums[i];
                minLen=Math.min(minLen,len);
                i++;
            }
            if(currsum<target){
                j++;
            }
        }
        
        
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}