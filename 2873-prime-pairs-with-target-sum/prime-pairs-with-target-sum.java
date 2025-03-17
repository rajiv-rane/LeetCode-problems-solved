class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        int [] sieve=new int[n+1];
        Arrays.fill(sieve,1);
        sieve[0]=0;
        sieve[1]=0;

        for(int i=2;i*i<=n;i++){
            if(sieve[i]==1){
                for(int j=i*2;j<=n;j=j+i){
                    sieve[j]=0;
                }
            }
        }

        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<=n;i++){
            if(sieve[i]==1){
                set.add(i);
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int x=2;x<=n/2;x++){
            
            if(sieve[x]==1){
                int y=n-x;
                if(sieve[x]==1 && set.contains(y)){
                    ans.add(Arrays.asList(x, y));
                }
            }
        }
        return ans;
    }
}