class Solution {
    
    public int[] singleNumber(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int ans[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        if(nums.length ==2)
            return nums;
        for(int i:nums){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
       
        for(int i:nums){
            if(map.get(i)==1){
                list.add(i);
            }
                
        } 
        int j=0;
        for(Integer i : list){
            ans[j]=(int)i;
            j++;
        }
        // return list.toArray(new int[list.size()]);
        // int ans[]=list.toArray(new int[list.size()]);
        return ans;
    }
}