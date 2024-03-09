class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int ans=Integer.MAX_VALUE;
        HashSet<Integer>s=new HashSet<>();
        if(n1>n2){
            for(int i: nums1){
                s.add(i);
            }
            for(int i:nums2){
                if(s.contains(i)){
                    ans=Math.min(ans,i);
                }
            }
            if(ans==Integer.MAX_VALUE)
                return -1;
            else 
                return ans;

        }
        else{
            for(int i:nums2){
                s.add(i);
            }
            for(int i: nums1){
                if(s.contains(i))
                    ans=Math.min(ans,i);
            }
            if(ans==Integer.MAX_VALUE)
                return -1;
            else 
                return ans;

        }

    }
}