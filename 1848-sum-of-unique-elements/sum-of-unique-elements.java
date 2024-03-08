class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int i;
        for(i=0;i<n;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        int sum=0;
        for(i=0;i<n;i++){
            if(map.get(nums[i])==1){
                sum=sum+nums[i];
            }
        }
        return sum;
    }
}