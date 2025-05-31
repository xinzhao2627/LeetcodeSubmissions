class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int a = 3, b = 2;
        for (int i = 3; i < n; i++){
            int tmp = a;
            a += b;
            b = tmp;
        }
        return a;
    }
}