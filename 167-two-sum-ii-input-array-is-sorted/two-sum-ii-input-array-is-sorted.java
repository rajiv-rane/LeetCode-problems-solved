class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // List<Integer>list=new ArrayList<>();
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int i,j;
        int n=numbers.length;
        for(i=1;i<=n;i++){
            int start=i-1;
            int end=n-1;
            while(start<end){
                if(numbers[start]+numbers[end]==target){
                    System.out.println(numbers[start]+numbers[end]);
                    ans[0]=start+1;
                    ans[1]=end+1;
                    return ans;
                }
                end--;
            }
        }
        return ans;
    }
}