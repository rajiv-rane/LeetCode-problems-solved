class Solution {
    public int maxSubArray(int[] nums) {
        //using kadane's algorithm
        /*We initialize current_max variable which denotes the max sum of subarrays achieved until index i */
        /*initialize current_max=global_max=nums[0]
        since nums[0] is the max subarray sum ending with element nums[0]*/
        /*we use another variable global_max =nums[0]*/
        int curr_max_sum,final_max_sum;
        curr_max_sum = final_max_sum = nums[0];

        for(int i=1;i<nums.length;i++){
            curr_max_sum=Math.max(nums[i],curr_max_sum+nums[i]);

            // if the recently updated value of currentMaxSum > final_max_sum then update final_maxSum=currentSum
            if(curr_max_sum>final_max_sum){
                //update
                final_max_sum=curr_max_sum;
            }
        }
        return final_max_sum;
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