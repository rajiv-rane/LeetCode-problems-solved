class Solution {
    public long maximumTripletValue(int[] nums) {
        int i,j,k;int n=nums.length;
        long max=0;
        // if(n==3){
        //     long value=(nums[0]-nums[1])*nums[2];
        //     max=Math.max(max,value);
        //     System.out.println("value="+value);
        //                 System.out.println("max="+max);
        // }
        
                for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    for(k=j+1;k<n;k++){
                        // long value=(nums[i]-nums[j])*nums[k];
                        max = Math.max(max, ((long)nums[i] - (long)nums[j]) * nums[k]);
                        // max=Math.max(max,value);
                        // System.out.println("value="+value);
                        // System.out.println("max="+max);
                    }
                }
            }
        
        
        
            return max;
    }
}