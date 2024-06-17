class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                int s=j+1;
                int e=n-1;
                while(s<e){
                    long  sum=(long)nums[i]+nums[j]+nums[s]+nums[e];
                    if(sum==target){
                        List<Integer>arr=new ArrayList<>();
                        arr.add(nums[i]);arr.add(nums[j]);
                        arr.add(nums[s]);arr.add(nums[e]);
                        set.add(arr);
                        s++;
                        e--;
                    }

                    else if(sum<target)
                        s++;
                    else
                        e--;
                }
            }
        }
        ans.addAll(set);
        return ans;
    }
}