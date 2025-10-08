class Solution {
    public int jump(int[] nums) {
        // number of jumps it takes to reach the goal state
        int res=0;
        int l=0; int r=0; //represents the window


        while(r<nums.length-1){
            int farthest=0;

            for(int i=l;i<=r;i++){
                farthest=Math.max(farthest,i+nums[i]);
            }
            l=r+1;
            r=farthest;
            res++;

        }
        return res;
    }
}