class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else
                map.put(i,1);
        }
        int j=0;
        int ans[]=new int[2];
        for(int i:map.keySet()){
            if(map.get(i)>1 && j<2)
                ans[j++]=i;
        }
        return ans;
    }
}