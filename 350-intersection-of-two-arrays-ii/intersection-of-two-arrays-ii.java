class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        int i=0,j=0;
        int n1=nums1.length;
        int n2=nums2.length;
        
        while(i<n1 &&j<n2){
            int a=nums1[i],b=nums2[j];
            if(a==b){
                list.add(a);
                i++;j++;
            }
            else if(a<b)
                i++;
            else //(a>b)
                j++;
        }
        int result[]=new int[list.size()];
        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }
        return result;

    }
}