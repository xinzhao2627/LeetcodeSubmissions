class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyAt = 0;
        for (int i = 0; i < prices.length; i++){
            int p = prices[i];
            if (prices[buyAt] > p){
                buyAt = i;
            }
            int current_profit = p - prices[buyAt];
            if (current_profit > profit){
                profit = current_profit;
            }
        }

        return profit;
    }
}