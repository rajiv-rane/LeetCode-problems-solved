class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();
        int ans[]=new int[2];
        int n=nums1.length; int m=nums2.length;
        int i,j;
        for(i=0;i<n;i++){
            if(map1.containsKey(nums1[i]))
                map1.put(nums1[i],map1.get(nums1[i])+1);
            else
                map1.put(nums1[i],1);
        }

        for(j=0;j<m;j++){
            if(map2.containsKey(nums2[j]))
                map2.put(nums2[j],map2.get(nums2[j])+1);
            else
                map2.put(nums2[j],1);
        }
        int count1=0;int count2=0;
        for(i=0;i<n;i++){
            if(map2.containsKey(nums1[i]))
                count1++;
        }
        ans[0]=count1;
        for(i=0;i<m;i++){
            if(map1.containsKey(nums2[i]))
                count2++;
        }
        ans[1]=count2;
        return ans;
    }
}