class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length==1)
            return nums;
        int[] ans=new int[2*n];
        int ptr1=0;
        int ptr2=n;
        int i=0;
        while(ptr1<n && ptr2<2*n){
            ans[i]=nums[ptr1];
            i++;
            ptr1++;

            // y coordinate
            ans[i]=nums[ptr2];
            i++;
            ptr2++;
        }
        return ans;
    }
}