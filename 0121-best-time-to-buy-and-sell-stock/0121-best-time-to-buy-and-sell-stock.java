class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int profit = 0;

        for (int p : prices){
            lowest = Math.min(lowest, p);
            profit = p - lowest > profit ? p - lowest : profit;
        }
        return profit;
    }
}