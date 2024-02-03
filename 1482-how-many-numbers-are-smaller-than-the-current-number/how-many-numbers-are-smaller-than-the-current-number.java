class Solution {
    // int[] reverse(int [] nums){
    //     int i=0;int j=nums.length-1;int temp;
    //     while(i<j){
    //         temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;
    //         i++;j--;
    //     }
    //     return nums;
    // }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Arrays.sort(nums);
        int n=nums.length;int i,j;
        int a[]=new int[n];

        for(i=0;i<n;i++){//copy nums to a
            a[i]=nums[i];
        }
        Arrays.sort(a);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(i=n-1;i>=0;i--){
            int count=0;
            for(j=i-1;j>=0;j--){
                count++;
            }
            map.put(a[i],count);
        }

        for(i=0;i<n;i++){
            a[i]=map.get(nums[i]);
        }
        return a;
    }
}