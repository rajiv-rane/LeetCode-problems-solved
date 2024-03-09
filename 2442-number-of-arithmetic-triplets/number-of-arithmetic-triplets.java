class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int i,j,k;
        int n=nums.length;
        int count=0;
        for(i=0;i<n-2;i++){
            for(j=i+1;j<n-1;j++){
                for(k=j+1;k<n;k++){
                    if((nums[k]-nums[j])==diff && (nums[j]-nums[i])==diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}