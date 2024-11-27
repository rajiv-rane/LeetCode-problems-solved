class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int pf_sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            pf_sum=pf_sum+i;
            count=count+map.getOrDefault(pf_sum-k,0);

            if(map.containsKey(pf_sum)){
                map.put(pf_sum,map.get(pf_sum)+1);
            }
            else{
                map.put(pf_sum,1);
            }
        }
        return count;
    }
}