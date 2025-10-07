class Solution {
    public int majorityElement(int[] nums) {
        // Boyer–Moore
        int result=0;
        int count=0;
        for(int i:nums){
            if(count==0){
                result=i;
            }
            // Algorithm begins here

            if(i==result){
                count++;
            }
            else{
                count--;
            }
        }
        return result;
    }
}