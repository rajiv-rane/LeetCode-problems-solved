class Solution {
    /**
    ->If N is Even then countOdds = N/2.
    ->If N is Odd then :
        ~ If low or high is Odd then countOdds = N/ 2+ 1.
        ~ Else countOdds = N/2. */
    public int countOdds(int low, int high) {
        int count=0;
        int N=high-low+1;
        if(N%2==0)
            return N/2;
        else{
            if(low%2==1 || high%2==1)
                return (N/2)+1;
            else 
                return N/2;
        }
        
    }
}