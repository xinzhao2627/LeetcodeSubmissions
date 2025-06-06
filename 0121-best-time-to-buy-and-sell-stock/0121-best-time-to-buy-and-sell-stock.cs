public class Solution {
    public int MaxProfit(int[] prices) {
        int res = 0;
        int cur = int.MaxValue;

        foreach (int p in prices){
            cur = (p < cur) ? p:cur;
            res = (p-cur > res) ? p-cur : res;
        }
        return res;
    }
}