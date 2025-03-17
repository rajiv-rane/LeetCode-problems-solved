class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }

        boolean seive[]=new boolean[n];
        seive[0]=false;
        seive[1]=false;

        Arrays.fill(seive,true);
        int count=0;
        for(int i=2;i<n;i++){
            if(seive[i]==true){
                count++;
                // traverse over multiples;
                for(int j=i*2;j<n;j=j+i){
                    seive[j]=false;
                }
            }
        }
        return count;
    }
}