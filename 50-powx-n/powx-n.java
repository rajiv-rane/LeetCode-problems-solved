class Solution {
    public double myPow(double x, int n) {
        double result=1;
        int N = Math.abs(n);
        if(n == Integer.MIN_VALUE) {
            N = Integer.MAX_VALUE - 1;
        }
        while(N>0){
            // it will perfrom a step for x^1 
            if(N%2==1){
                //if power is odd then that extra x^1 should be multiplied to result
                result=result*x;
            }
            x=x*x;
            N=N/2;
        }
        if(n<0)
            return 1/result;
        else
            return result;
    }
}