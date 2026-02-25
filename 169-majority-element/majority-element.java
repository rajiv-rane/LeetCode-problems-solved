class Solution {
    public int majorityElement(int[] nums) {
        //if we delete 2 distinct entries , then majority element won't change
        int n=nums.length;
        int ele,freq,i;
        int count=0;
        ele=nums[0];
        freq=1;
        for(i=1;i<n;i++){
            if(freq==0){
                //update prev element to current elemet
                ele=nums[i];
                freq=1;
            }
            else if(ele==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ele; //returning since Q says 1 majority elements always exists
        //linear search the ele in arr , if count >N/2 then it's majority else 
        //no majority element exists'

        // for(i=0;i<n;i++){
        //     if(nums[i]==ele){
        //         count++;
        //     }
        // }
        // if(count>n/2){return ele;}
    }
}