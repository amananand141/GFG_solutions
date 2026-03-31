class Solution {
    public int maxProfit(int[] prices, int k) {
        int hold = -prices[0];  // bought first stock
        int cash = 0;           // no stock initially
        
        for (int i = 1; i < prices.length; i++) {
            hold = Math.max(hold, cash - prices[i]);
            cash = Math.max(cash, hold + prices[i] - k);
        }
        
        return cash;
    }
}
