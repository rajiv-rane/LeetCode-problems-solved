class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        int size=nums.length;
        int n=size/2;
        int ans=0;
        for(int i:nums){
            if(map.get(i)==n){
                ans=i;
                return i;
            }
        }
        return ans;
    }
}