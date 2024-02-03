class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int i,n; n=nums.length;
        // for(i=0;i<n;i++){ //creation of set
        //     set.add(nums[i]);
        // }

        for(i=0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}