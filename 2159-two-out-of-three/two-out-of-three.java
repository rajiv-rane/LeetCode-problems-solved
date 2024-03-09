class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer>common=new HashSet<>();
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        // List<Integer>list=new ArrayList<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i))
                common.add(i);
            else
                set2.add(i);
        }
        for(int i: nums3){
            if(set1.contains(i)||set2.contains(i)){
                common.add(i);
            }
            
        }
        
        return new ArrayList<>(common);
    }
}