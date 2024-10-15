class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)==2)
                list.add(i);
        }
        return list;
    }
}