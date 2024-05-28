class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // List<Integer>list=new ArrayList<>();
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int i,j;
        int n=numbers.length;
        int s=0;int e=n-1;
        while(s<=e){
            if(numbers[s]+numbers[e]==target){
                ans[0]=s+1;
                ans[1]=e+1;
                return ans;
            }
            else if(numbers[s]+numbers[e]<target){
                s++;
            }
            else
                e--;
        }
        return ans;
    }
}