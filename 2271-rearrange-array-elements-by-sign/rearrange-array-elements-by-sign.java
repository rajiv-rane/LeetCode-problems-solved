class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int p1=0;int p2=0;
        int first=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg[p2]=nums[i];
                p2++;
            }
                
            else{
                pos[p1]=nums[i];
                p1++;
            }
        }

        p1=0;p2=0;int p3=0;
        while(p1<pos.length && p2<neg.length){
            nums[p3]=pos[p1];
            p3++;p1++;
            nums[p3]=neg[p2];
            p3++;p2++;
        }
        return nums;
    }
}