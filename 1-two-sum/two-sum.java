class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        //iterate upper/lower triangular matrix of indices
        //i: [0,N-2] & j:[i+1, N-1] for upper triangular matrix
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j; 
                }
            }
        }
        return arr;
    }
}