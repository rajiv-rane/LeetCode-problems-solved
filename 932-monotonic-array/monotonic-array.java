class Solution {
    public boolean isMonotonic(int[] nums) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i:nums){
        //     if(map.containsKey(i)){
        //         map.put(i,map.get(i)+1);
        //     }
        //     else{
        //         map.put(i,1);
        //     }
        // }
        int n=nums.length;
        int i,j;
        boolean flag=true;
        for(i=1;i<n;i++){
            if(nums[i-1]<=nums[i])
                continue;
            else{
                flag=false;
                break;
            }       
        }
        if(flag==true)
            return true;
        flag=true;
        for(i=1;i<n;i++){
            if(nums[i-1]>=nums[i])
                continue;
            else
                flag=false;
        }
        return flag;


        
        
        
    }
}