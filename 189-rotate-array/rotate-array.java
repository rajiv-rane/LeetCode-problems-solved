class Solution {
    void reverseNum(int a[],int n,int si,int ei){
        int i=si;
        int j=ei;
        while(i<j){
            int temp=a[i];//swap
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
    public void rotate(int[] nums, int k) {
        // reverse the entire array n/2 iterations
        // reverse the array from 0 to k-1 index(k elements) k/2 iterations
        // reverse array from k to n-1 index (n-k)elements = (n-k)/2 iterations
        int n=nums.length;
        if(k>n){
            k=k%n;
        }
        reverseNum(nums,n,0,n-1);
        reverseNum(nums,n,0,k-1);
        reverseNum(nums,n,k,n-1);
    }
}