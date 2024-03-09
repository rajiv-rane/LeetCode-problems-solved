class Solution {
    public int maximumWealth(int[][] accounts) {
        int total=0;
        int m=accounts.length;
        int n=accounts[0].length;
        for(int i=0;i<m;i++){
            int wealth=0;
            for(int j:accounts[i]){
                wealth=wealth+j;
            }
            total=Math.max(total,wealth);
        }
        return total;
    }
}