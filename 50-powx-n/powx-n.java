class Solution {
    public double myPow(double x, int n) {
        int N=Math.abs(n);
        if(N==Integer.MIN_VALUE)
            N=Integer.MAX_VALUE-1;
        double res=1;
        while(N>0){
            if(N%2==1){
                res=res*x;
            }
            x=x*x;
            N=N/2;
        }
        if(n<0)
            return 1/res;
        else
            return res;
    }
}