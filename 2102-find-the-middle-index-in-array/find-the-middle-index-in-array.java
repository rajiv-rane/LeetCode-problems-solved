class Solution {
    public int findMiddleIndex(int[] nums) {
        int i,n=nums.length;
        int pf[]=new int[n];
        int sf[]=new int[n];
        pf[0]=nums[0];
        sf[0]=nums[n-1];
        
        //create suffix and prefix arrays
        for(i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
            sf[i]=sf[i-1]+nums[n-i-1];
        }
        // for(i=n-2;i>=0;i--){
        //     sf[n-i-1]=sf[n-i-2]+nums[i];
        // }

        for(i=0;i<n;i++){
            if(pf[i]==sf[n-i-1]){
                return i;
            }
        }
        return -1;
    }
}