class Solution {
    public long[] sumOfThree(long num) {
        long [] ans=new long[3];
        long x=num/3;
        ans[0]=x-1;
        ans[1]=x;
        ans[2]=x+1;
        Arrays.sort(ans);
        long sum=0;
        for(long i:ans)
            sum+=i;
        // System.out.println(sum);
        // System.out.println("x-1");
        // System.out.println("x");
        // System.out.println("x+1",ans);
        if(sum==num)
            return ans;
        else 
            return new long[0];
        
    }
}