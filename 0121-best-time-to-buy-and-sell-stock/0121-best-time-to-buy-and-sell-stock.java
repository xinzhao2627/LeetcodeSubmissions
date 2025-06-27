class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int profit = 0;

        for (int n: prices){
            lowest = lowest < n ? lowest : n;
            profit = n - lowest > profit? n-lowest : profit;
        }
        return profit;
    }
}