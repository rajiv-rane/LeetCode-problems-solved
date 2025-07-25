class Solution {
    public int maxSum(int[] nums) {
        int maxEle=Integer.MIN_VALUE;

        for(int i:nums){
            maxEle=Math.max(i,maxEle);
        }
        if(maxEle<0){
            return maxEle;
        }
        
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
            set.add(i);

        int sum=0;
        for(Integer i:set){
            if(i>0){
                sum=sum+i;
            }
        }
        return sum;

    }
}