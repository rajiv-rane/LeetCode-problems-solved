class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        for(int i: nums){
            if(map.get(i)==1)
                return i;
        }
        return -1;
    }
}