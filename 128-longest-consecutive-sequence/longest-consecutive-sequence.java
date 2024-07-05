class Solution {
    public int longestConsecutive(int[] nums) {
        // starting point are those points who num-1 
        // is not present in the array
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        
        int maxLen=0;
        // to find the start point of the sequence
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(!set.contains(nums[i]-1)){
                //starting point
                count++;
                int find=nums[i]+1;
                while(set.contains(find)){
                    find++;
                    count++;
                }
                maxLen=Math.max(count,maxLen);
            }
            
        }
        return maxLen;
    }
}