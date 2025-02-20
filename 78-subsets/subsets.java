class Solution {

    public void helper(int[] nums,List<List<Integer>>output,List<Integer>ans,int index){
        output.add(new ArrayList<>(ans));
        for(int i=index;i<nums.length;i++){
            ans.add(nums[i]);
            helper(nums,output,ans,i+1);//call the next index
            ans.remove(ans.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        // for every nums[i] we got 2 choices
        // 1. either pick the element 2. either ignore the element
// so append and remove the element from a intermediate list to mock the above 2 steps
        List<List<Integer>>output=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        helper(nums,output,ans,0);
        return output;
    }
}