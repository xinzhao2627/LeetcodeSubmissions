import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {  
        int cheapest = Integer.MAX_VALUE;
        int profit = 0;

        for (int p : prices){
            cheapest = (p < cheapest) ? p: cheapest;
            profit = (p-cheapest > profit) ?p-cheapest: profit;
        } 
        return profit;
    }
}