class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            if(set.contains(-1*i))
                list.add(Math.abs(i));
        }
        int maxval=Integer.MIN_VALUE;
        for(int i:list){
            maxval=Math.max(maxval,i);
        }
        return (maxval==Integer.MIN_VALUE)?-1:maxval;
    }
}