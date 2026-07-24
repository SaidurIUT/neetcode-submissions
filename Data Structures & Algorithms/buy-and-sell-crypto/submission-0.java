class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxP = 0;
        
        for(int curr : prices){
            maxP = Math.max(maxP, curr - minBuy);
            minBuy = Math.min(minBuy, curr);
        }

        return maxP;
    }
}
