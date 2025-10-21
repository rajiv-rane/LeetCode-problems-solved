class Solution {
    public int distinctAverages(int[] nums) {
        Set<Float>set=new HashSet<>();
        Arrays.sort(nums);
        int s=0;int e=nums.length-1;
        while(s<=e){
            float avg=(float)(nums[s]+nums[e])/2;
            set.add(avg);
            s++;e--;
        }
        System.out.println(set);
        return set.size();
    }
}