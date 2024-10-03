class Solution {
    public int differenceOfSum(int[] nums) {
        // digit sum
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            List<Integer>temp=new ArrayList<>();
            int n=i;
            while(n>0){
                int ld=n%10;
                temp.add(ld);
                n=n/10;
            }
            for (int j=temp.size()-1;j>=0;j--){
                list.add(temp.get(j));
            }
        }
        int digitsum=0;
        for(Integer i:list){
            digitsum=digitsum+i;
        }
        // element sum

        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return Math.abs(digitsum-sum);
        // int ans[]=new int[list.size()];
        // for(int i=0;i<ans.length;i++){
        //     ans[i]=list.get(i);
        // }
    }
}