class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s,e;
        int ans=arr[0];
        int n=arr.length;
        s=0;e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]<arr[mid+1])
                s=mid+1;
            else{
                ans=mid;
                e=mid-1;
            }
                
                
                
        }
        return ans;
        
    }
}