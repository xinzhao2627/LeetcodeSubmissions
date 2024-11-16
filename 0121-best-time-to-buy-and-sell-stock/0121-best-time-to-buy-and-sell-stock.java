import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = Integer.MAX_VALUE, max_profit = 0;

        for (int p: prices){
            cheapest = (p < cheapest) ? p : cheapest;

            max_profit = ((p - cheapest) > max_profit) ? p-cheapest : max_profit;
        }


        return max_profit;
    }
}