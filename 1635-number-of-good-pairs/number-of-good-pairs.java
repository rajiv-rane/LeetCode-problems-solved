class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int n=nums.length;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}