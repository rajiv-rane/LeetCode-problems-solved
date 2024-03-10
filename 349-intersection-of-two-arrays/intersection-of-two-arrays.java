class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>intersect=new HashSet<>();

        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i))
                intersect.add(i);
        }
        int n=intersect.size();
        int ans[]=new int [n];
        int j=0;
        for(Integer i: intersect){
            ans[j]=i;
            j++;
        }
        return ans;
    }
}