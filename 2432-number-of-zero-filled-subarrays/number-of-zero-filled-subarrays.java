class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // If we found 0 in an array increase the count with +1, continue till you keep on finding consecutive 0's.And Keep udpdating ans
        int count=0;long ans=0;
        for(int i:nums){
            if(i==0)
                count++;
            else 
                count=0;
            ans+=count;
            
        }
        return ans;
    }
}