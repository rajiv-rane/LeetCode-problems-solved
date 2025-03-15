class Solution {
    public int countPrimes(int n) {
        if(n<=2)
            return 0;

        boolean primes[]=new boolean[n];
        primes[0]=false;
        primes[1]=false;

        Arrays.fill(primes,true);
        int count=0;
        for(int i=2;i<n;i++){
            if(primes[i]==true){
                count++;
                for(int j=i*2;j<n;j=j+i){
                    primes[j]=false;
                }
            }
        }
        return count;
    }
}