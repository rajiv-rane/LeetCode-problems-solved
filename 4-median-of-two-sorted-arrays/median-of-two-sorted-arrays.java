class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        

        int arr[]=new int[nums1.length+nums2.length];
        int m=nums1.length;
        int n=nums2.length;

        // merge the 2 arrays
        int ptr1=0;int ptr2=0;
        int i=0;
        while(ptr1<m && ptr2<n){
            if(nums1[ptr1]<=nums2[ptr2]){
                arr[i]=nums1[ptr1];
                i++;
                ptr1++;
            }
            else{
                arr[i]=nums2[ptr2];
                i++;
                ptr2++;
            }
        }
        while(ptr1<m){
            arr[i]=nums1[ptr1];
            ptr1++;
            i++;
        }
        while(ptr2<n){
            arr[i]=nums2[ptr2];
            ptr2++;
            i++;
        }
        
        // for(int k=0;k<arr.length;k++){
        //     System.out.print(arr[k]+" ");
        // }


        int N=arr.length;
        if(N%2==1){
            return (double)arr[N/2];
        }
        else{
            double ans= arr[N/2]+arr[(N/2)-1];
            // System.out.println(arr[N/2]+" "+arr[N/2+1]);
            return ans/2;
        }
    }
}