class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length,left=1,right=1;
        // prefix product
        int pf[]=new int[n];
        int sf[]=new int[n];
        pf[0]=nums[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]*nums[i];
        }
        //suffix product
        sf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sf[i]=sf[i+1]*nums[i];
        }

        //iterate over array
        for(int i=0;i<n;i++){
            if(i==0){
                left=1;
                right=sf[i+1];
            }
            else if(i==n-1){
                right=1;
                left=pf[i-1];
            }
            else{
                left=pf[i-1];
                right=sf[i+1];
            }
            nums[i]=left*right;
        }
        return nums;
    }
}