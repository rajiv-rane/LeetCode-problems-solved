class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int arr[]=new int [n];
        int i,j;
        int min1,min2;
        j=0;
        for(i=0;i<n;i=i+2){
            min1=nums[i];min2=nums[i+1];
            arr[j]=min2;
            j++;
            arr[j]=min1;
            j++;
        }
        return arr;
    }
}