class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int prev = 2;
        int cur = 3;
        for (int i = 3; i < n; i++){
            int tmp = cur;
            cur = cur + prev;
            prev = tmp;
        }
        return cur;
    }
}