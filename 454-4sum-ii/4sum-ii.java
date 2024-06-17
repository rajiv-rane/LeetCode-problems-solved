class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        Arrays.sort(nums4);
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int n1:nums1){
            for(int n2:nums2){
                map.put(n1+n2,map.getOrDefault(n1+n2,0)+1);
            }
        }

        for(int n3:nums3){
            for(int n4:nums4){
                int sum=n3+n4;
                if(map.containsKey(-sum))
                    count=count+map.get(-sum);
            }
        }
        return count;
    }
}