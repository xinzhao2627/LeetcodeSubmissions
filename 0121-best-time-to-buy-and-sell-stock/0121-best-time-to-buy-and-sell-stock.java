import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = Integer.MAX_VALUE;
        int output = 0;

        for (int i = 0; i < prices.length; i++){
            cheapest = (prices[i] < cheapest) ? prices[i] : cheapest;

            output = ((prices[i] - cheapest) > output) ? prices[i] - cheapest : output;
        }


        return output;
    }
}