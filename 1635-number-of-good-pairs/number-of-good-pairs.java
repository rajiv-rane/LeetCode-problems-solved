class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){//if element is present
                count=count+map.get(i);
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        return count;
            
        
    }
}