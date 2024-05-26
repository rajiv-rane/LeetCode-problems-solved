class Solution {
    public int mySqrt(int x) {
        long s=0;
        long e=x;
        long ans=0;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid*mid==x){
                ans=mid;
                return (int)mid;
                // return x;
            }
                
            else if(mid*mid>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return (int)e;
    }
}