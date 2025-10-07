class Solution {
    public int maxProfit(int[] prices) {
        // left=BUY
        // right=SELL 
        // Price on LEFT should be lesser than RIGHT

        int l=0;
        int r=1;
        int n=prices.length;
        int Maxprofit=0;
        while(r<n){
            if(prices[l]<prices[r]){
                int profit=(prices[r]-prices[l]);
                Maxprofit=Math.max(profit,Maxprofit);
            }
            else{
                l=r; //reset to lowest price found on right
            }
            r++;
        }
        return Maxprofit;
    }
}