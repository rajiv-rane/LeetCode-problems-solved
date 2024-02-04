class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // List<Integer> intList = new ArrayList<Integer>(ans.length);
        List<Integer> list = new ArrayList<>();
        int i,n=nums.length;
        Arrays.sort(nums);
        for(i=0;i<n;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}