class Solution {
    public int thirdMax(int[] nums) {
        int max1,max2,max3;
        Arrays.sort(nums);
        max1=max2=max3=nums[0];
        int i,n=nums.length;
        //get distinct elements using HASHSet
        HashSet<Integer>Set=new HashSet<>();
        for(i=n-1;i>=0;i--){
                Set.add(nums[i]);
                if(Set.size()==3){
                    return nums[i];
                }    
        }
        return nums[n-1];

        /*for(i=1;i<n;i++){
            if(max1>nums[i]){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }
        }
        if(n==2 ||n==1 )
            return nums[n-1];
        else if(max2==max3 ||max1==max2 || max1==max3){
            return max1;
        }
        else
            return max3;*/
    }
}