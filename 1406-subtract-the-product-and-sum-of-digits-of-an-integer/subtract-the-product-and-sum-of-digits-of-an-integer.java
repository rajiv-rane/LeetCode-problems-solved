class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int l;
        int prod=1;
        while(n>0){
            l=n%10;
            prod=prod*l;
            sum=sum+l;
            n=n/10;
        }
        
        return (prod-sum);
    }
}