class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int [2*n];
        int i,j;
        for(i=0;i<n;i++){
            ans[i]=nums[i];
        }
        j=0;
        for(;i<2*n;i++){
            ans[i]=nums[j];
            j++;
        }
        return ans;
    }
}