class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n; 
        int prev = 2;
        int cur = 3;

        for (int i = 2; i < n; i++){
            int tmp = prev;
            prev = cur;
            cur += tmp;
        }
        return prev;
    }
}