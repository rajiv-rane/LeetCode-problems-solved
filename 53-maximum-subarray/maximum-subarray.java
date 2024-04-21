class Solution {
    public int maxSubArray(int[] nums) {
        //using kadane's algorithm
        /*We initialize current_max variable which denotes the max sum of subarrays achieved until index i */
        /*initialize current_max=global_max=nums[0]
        since nums[0] is the max subarray sum ending with element nums[0]*/
        /*we use another variable global_max =nums[0]*/
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            /*carry forward the sum if the current sum is positive*/
            sum=sum+nums[i];
            maxSum=Math.max(sum,maxSum);
            /*if the current sum is negative then no need to include it 
            while carrying it forward*/
            if(sum<0){
                sum=0;
                /*if sum is -ve => rest sum to 0 
                since we don't need -ve resultant to be added to sum*/ 
            }
        }
        return maxSum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int i,j;
//         int n=nums.length;
//         int pf[]=new int [n];
//         pf[0]=nums[0];
//         for(i=1;i<n;i++){
//             pf[i]=pf[i-1]+nums[i];
//         }
        
//         int sum=0;
//         int ans=nums[0];
//         for(i=0;i<n;i++){
//             for(j=i;j<n;j++){
//                 if(i==0){
//                     sum=pf[j];
//                 }
//                 else{
//                     sum=pf[j]-pf[i-1];
//                 }
//                 ans=Math.max(ans,sum);
//             }
//         }
//         return ans;
//     }
// }