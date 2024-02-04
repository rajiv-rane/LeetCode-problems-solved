class Solution {
    public int countPairs(List<Integer> nums, int target) {
        //convert List to int[]
        int[] arr = new int[nums.size()];
        int count=0;
        int i,j,n=arr.length;
        for(i = 0; i < n; i++)
            arr[i] = nums.get(i);
        
        //brute force
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]+arr[j]<target)
                    count++;
            }
        }
        return count;

    }
}