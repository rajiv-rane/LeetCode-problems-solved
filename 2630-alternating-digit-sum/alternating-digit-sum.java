class Solution {
    public int alternateDigitSum(int n) {
        List<Integer>list=new ArrayList<>();
        while(n>0){
            int ld=n%10;
            list.add(ld);
            n=n/10;
        }
        int ans=0;
        int j=0;
        for(int i=list.size()-1;i>=0;i--){
            if(j%2==0)
                ans=ans+list.get(i);
            else
                ans=ans-list.get(i);
            j++;
        }
        return ans;
    }
}