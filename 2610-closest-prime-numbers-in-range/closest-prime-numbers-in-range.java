class Solution {

    // public int[] generateSieve(int n){
    //     int[] sieve=new int[n];
    //     sieve[0]=0;
    //     sieve[1]=0;
    //     Array.fill(sieve,1);
    //     for(int i=2;i<n;i++){
    //         if(sieve[i]==1){
    //             for(int j=i*2;j<n;j=j+i){
    //                 sieve[i]=0;
    //             }
    //         }
    //     }
    // }

    public int[] closestPrimes(int left, int right) {

        if (right < 2) return new int[]{-1, -1}; // No primes exist

        // Generate sieve
        int n = right + 1;
        int[] sieve = new int[n];
        Arrays.fill(sieve, 1); // Assume all numbers are prime

        sieve[0] = 0; // 0 is not prime
        sieve[1] = 0; // 1 is not prime

        for (int i = 2; i * i < n; i++) {
            if (sieve[i] == 1) { // i is prime
                for (int j = i * i; j < n; j += i) { 
                    sieve[j] = 0; // Mark multiples as non-prime
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (sieve[i] == 1) {
                primes.add(i);
            }
        }

        // If there are less than two primes, return [-1, -1]
        if (primes.size() < 2) 
            return new int[]{-1, -1};

        int[] ans = new int[]{-1, -1};
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = primes.get(i - 1);
                ans[1] = primes.get(i);
            }
        }
        return ans;

        // // generate sieve
        // int n = right + 1;
        // int[] sieve = new int[n];
        // Arrays.fill(sieve, 1); // Assume all numbers are prime

        // sieve[0] = 0; // 0 is not prime
        // if (n > 1) sieve[1] = 0; // 1 is not prime

        // Arrays.fill(sieve,1);
        // for(int i=2;i*i<n;i++){
        //     if(sieve[i]==1){
        //         for(int j=i*i;j<n;j=j+i){
        //             sieve[j]=0;
        //         }
        //     }
        // }

        // ArrayList<Integer>primes=new ArrayList<>();
        // for(int i=left;i<=right;i++){
        //     if(sieve[i]==1){
        //         primes.add(i);
        //     }
        // }

        // // If there are less than two primes, return [-1, -1]
        // if (primes.size() < 2) 
        //     return new int[]{-1, -1};

        // System.out.println(primes);

        // int[] ans = new int[]{-1, -1};

        // int minDiff=Integer.MAX_VALUE;

        // for(int i=1;i<primes.size();i++){
        //     int diff=primes.get(i)-primes.get(i-1);
        //     if(diff<minDiff){
        //         minDiff=diff;
        //         ans[0]=primes.get(i-1);
        //         ans[1]=primes.get(i);
        //     }
        // }
        // return ans;
        
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
        // [0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 11, 11, 11, 11, 11, 11, 11, 18, 11]
    }
}