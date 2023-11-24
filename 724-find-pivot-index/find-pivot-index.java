class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pf[]=new int[n];
        pf[0]=nums[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        int left,right;
        for(int i=0;i<n;i++){
            if(i==0){
                left=0;
            }
            else{
                left=pf[i-1];
            }
            right=pf[n-1]-pf[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}