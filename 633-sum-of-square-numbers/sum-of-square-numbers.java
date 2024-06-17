class Solution {
    public boolean judgeSquareSum(int c) {
        long s=0;
        long e=(long)Math.sqrt(c);
        while(s<=e){
            long sum=s*s+e*e;
            if(sum==c)
                return true;
            else if(sum<c)
                s++;
            else 
                e--;
        }
        return false;
    }
}