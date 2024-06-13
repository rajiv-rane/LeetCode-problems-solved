class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n=nums.length;
        int m=l.length;
        
        List<Boolean>list=new ArrayList<>();
        for(int i=0;i<m;i++){
            int k=0;
            int arr[]=new int[r[i]-l[i]+1];
            for(int j=l[i];j<=r[i];j++){
                arr[k]=nums[j];
                k++;
            }
            Arrays.sort(arr);
            boolean ans=true;
            int d=arr[1]-arr[0];
            for(int s=2;s<arr.length;s++){
                if(arr[s]-arr[s-1]!=d)
                    ans=false;
            }
            list.add(ans);

        }
        return list;
    }
}