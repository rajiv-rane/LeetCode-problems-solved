class Solution {
    public int findTheWinner0(int n,int k){
        if(n==1)
            return 0;
        else 
            return (findTheWinner0(n-1,k)+k)%n;
    }

    public int findTheWinner(int n, int k) {
        return findTheWinner0(n,k)+1;
    }
}