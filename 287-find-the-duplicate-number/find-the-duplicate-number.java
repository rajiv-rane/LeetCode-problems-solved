class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int ans=0;
        for(int i:nums){
            if(set.contains(i)){
                ans=i;
                break;
            }
            else{
                set.add(i);
            }
        }
        return ans;
    }
}