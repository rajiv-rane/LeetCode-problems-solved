class Solution {
    public int specialArray(int[] nums) {
        int ans=-1; int n=nums.length;
        for(int i=1;i<=n;i++){
            int freq=0;
            for(int j=0;j<n;j++){
                if(nums[j]>=i)
                    freq++;
            }
            if(i==freq)
                ans=i;
        }

        return ans;
    }
}